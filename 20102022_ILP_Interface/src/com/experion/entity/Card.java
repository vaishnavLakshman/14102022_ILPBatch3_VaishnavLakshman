package com.experion.entity;

public class Card extends Product implements AccountCardServices {

	private String cardType;

	public Card(String productCode, String productName, String productType, String cardType) {
		super(productCode, productName, productType);
		this.cardType = cardType;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	@Override
	public void checkBalance() {
		System.out.println("Balance check initiated");
		
	}

	@Override
	public void cashWihdrawal() {
		System.out.println("Cash withdrawal initiated");
		
	}
	

	
}
