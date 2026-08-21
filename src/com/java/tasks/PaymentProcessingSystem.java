package com.java.tasks;

import java.util.UUID;

abstract class Payment{
	abstract void processPayment();
	abstract void validateTransaction();
	public void generateTransactionId() {
		String TransactionId=UUID.randomUUID().toString();
		System.out.println("Generated transaction ID :  " + TransactionId);
		
	}
}
class CreditCardPayment extends Payment{
	String cardNumber;
	String expiryDate;
	String cvv;
	public CreditCardPayment(String cardNumber,String expiryDate,String cvv) {
		this.cardNumber=cardNumber;
		this.expiryDate=expiryDate;
		this.cvv=cvv;
	}
	@Override
	void processPayment() {
		System.out.println("Processing credit card payment.");
	}

	@Override
	void validateTransaction() {
		System.out.println("Validating card number, expiry, and CVV.");
	}
}
class UPIPayment extends Payment{
	String  upiId;
	String phoneNumber;
	
	public UPIPayment(String  upiId,String phoneNumber) {
		this.upiId=upiId;
		this.phoneNumber=phoneNumber;
	}
	
	@Override
	void processPayment() {
		System.out.println("Processing UPI payment.");
	}

	@Override
	void validateTransaction() {
		System.out.println("Validating UPI ID and phone number.");
	}
	
}
class PayPalPayment extends Payment{
	String email;
	String authToken;
	public PayPalPayment(String email,String authToken) {
		this.email=email;
		this.authToken=authToken;
		
	}
	@Override
	void processPayment() {
		System.out.println("Processing PayPal payment.");
	}

	@Override
	void validateTransaction() {
		System.out.println("Validating email and authentication token.");
	}
}
public class PaymentProcessingSystem {

	public static void main(String[] args) {
	Payment p;
	p=new CreditCardPayment("1234567890123456", "12/25", "123");
	p.processPayment();
	p.validateTransaction();
	p.generateTransactionId();
	
	System.out.println();
	
	p=new UPIPayment("user@upi", "1234567890");
	p.processPayment();
	p.validateTransaction();
	p.generateTransactionId();
	
	System.out.println();
	
	p=new PayPalPayment("user@example.com", "abc123");
	p.processPayment();
	p.validateTransaction();
	p.generateTransactionId();
	
	

	}

}
