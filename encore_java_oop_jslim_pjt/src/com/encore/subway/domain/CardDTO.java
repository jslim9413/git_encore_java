package com.encore.subway.domain;

/*
 * 카드 정보를 담는 엔티티
 */
public class CardDTO {
	private int balance ;
	public CardDTO() {
		super();
	}
	public CardDTO(int balance) {
		super();
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "CardDTO [balance=" + balance + "]";
	} 
	
	
}


