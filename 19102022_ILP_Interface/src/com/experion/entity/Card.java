package com.experion.entity;

public class Card extends Product implements AccountCardServices{
	
	private String cardNumber;
	private double cardBalance;
	
	
	public Card(String productName, String cardNumber, double cardBalance) {
		super(productName);
		this.cardNumber = cardNumber;
		this.cardBalance = cardBalance;
	}


	public String getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	public double getCardBalance() {
		return cardBalance;
	}


	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}


	@Override
	public void checkProductValidity() {
		
		System.out.println("Validity check of card class called");
		// TODO Auto-generated method stub
		
	}


	@Override
	public void checkBalance() {
		System.out.println("Balance check initiated\n");
		
	}


	@Override
	public void cashWithdrawal() {
		System.out.println("Cash withdrawal initiated\n");
		
	}



	
	

}