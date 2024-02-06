package com.encore.subway.service;

import com.encore.subway.domain.CardDTO;
import com.encore.subway.domain.StationDTO;

public class SubwayServiceImpl implements SubwayService{
	
	public static final int BASIC_FEE = 800 ;
	
	@Override
	public int chargeFree(CardDTO card, StationDTO start, StationDTO end) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean subtractBalance(CardDTO card, int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getDistance(StationDTO start, StationDTO end) {
		// TODO Auto-generated method stub
		return 0;
	}

}

