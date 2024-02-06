package com.encore.subway.service;

import com.encore.subway.domain.CardDTO;
import com.encore.subway.domain.StationDTO;

public class SubwayServiceImpl implements SubwayService{
	
	public static final int BASIC_FEE = 800 ;
	
	@Override
	public int chargeFree(CardDTO card, StationDTO start, StationDTO end) {
		int fee = 0 ;
		int distance = getDistance(start, end);
		System.out.println("distance : " + distance ); 
		// 거리 계산
		if( distance <= 12 ) {
			fee = BASIC_FEE ; 
		} else if(distance > 12 && distance <= 42) {
			fee = BASIC_FEE + ( ((distance - 12 - 1) / 6 ) + 1 ) * 100 ;
		} else {
			fee = BASIC_FEE + (5 * 100)  + ( ( (distance - 42 - 1 ) / 12) + 1)  * 100 ;
		}
		// 요금 차감
		if(subtractBalance(card, fee)) {
			return fee ; 
		} else {
			return -1 ;
		}
		
	}
	@Override
	public boolean subtractBalance(CardDTO card, int amount) {
		int currentBalance = card.getBalance() - amount ;
		if(currentBalance >= 0) {
			card.setBalance(currentBalance);
			return true ; 
		}
		return false;
	}

	@Override
	public int getDistance(StationDTO start, StationDTO end) {
		
		return Math.abs(start.getLocation() - end.getLocation() );
	}

}

