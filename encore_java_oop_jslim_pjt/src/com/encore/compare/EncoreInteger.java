package com.encore.compare;

public class EncoreInteger implements Comparable<EncoreInteger> {
	private int data ; 
	
	public EncoreInteger() {
	}
	
	public EncoreInteger(int data) { 
		this.data = data ;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public int compareTo(EncoreInteger o) {
		return -(this.data - o.data) ; 
	}
	
	
}
