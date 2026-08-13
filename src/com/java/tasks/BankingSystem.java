package com.java.tasks;

import java.util.Scanner;

class BankAccount {
	double Amount;
	String Name;
	String Address;

	public BankAccount(double Amount, String Name, String Address) {
		this.Amount = Amount;
		this.Name = Name;
		this.Address = Address;
		System.out.println("Account created Successfully");
	}

	public void deposit(double Amount) {
		this.Amount += Amount;
		System.out.println("Amount deposited:" + Amount);
	}

	public void withdraw(double Amount) {
		if (this.Amount > Amount) {
			this.Amount -= Amount;
			System.out.println("Amount withdrawl:" + Amount);
		} else {
			System.out.println("insufficient balance " + Amount);
		}

	}

	public void calculateInterest() {
		System.out.println("General Account Interest");
	}

	public void displayAccountDetails() {
		System.out.println(Name);
		System.out.println(Address);
		System.out.println(Amount);
	}

}

class SavingsAccount extends BankAccount {
	public SavingsAccount(double Amount, String Name, String Address) {
		super(Amount, Name, Address);

	}

	@Override
	public void deposit(double Amount) {
		this.Amount += Amount;
		System.out.println("Amount deposited:" + Amount);
	}

	@Override
	public void withdraw(double Amount) {
		if (this.Amount > Amount) {
			this.Amount -= Amount;
			System.out.println("Amount withdrawl:" + Amount);
		} else {
			System.out.println("insufficient balance " + Amount);
		}
	}

	@Override
	public void calculateInterest() {
		Double interest = Amount * 0.06;
		System.out.println("Saving Account Interest is :" + interest);
	}

	@Override
	public void displayAccountDetails() {
		System.out.println(Name);
		System.out.println(Address);
		System.out.println(Amount);
	}
}

class CurrentAccount extends BankAccount {

	public CurrentAccount(double Amount, String Name, String Address) {
		super(Amount, Name, Address);

	}

	@Override
	public void deposit(double Amount) {
		this.Amount += Amount;
		System.out.println("Amount deposited:" + Amount);
	}

	@Override
	public void withdraw(double Amount) {
		if (this.Amount > Amount) {
			this.Amount -= Amount;
			System.out.println("Amount withdrawl:" + Amount);
		} else {
			System.out.println("insufficient balance " + Amount);
		}
	}

	@Override
	public void calculateInterest() {
		System.out.println("Interest for Current Interest is 0");
	}

	@Override
	public void displayAccountDetails() {
		System.out.println(Name);
		System.out.println(Address);
		System.out.println(Amount);

	}
}

class SalaryAccount extends BankAccount {
	public SalaryAccount(double Amount, String Name, String Address) {
		super(Amount, Name, Address);
	}

	@Override
	public void deposit(double Amount) {
		this.Amount += Amount;
		System.out.println("Amount deposited:" + Amount);
	}

	@Override
	public void withdraw(double Amount) {
		if (this.Amount > Amount) {
			this.Amount -= Amount;
			System.out.println("Amount withdrawl:" + Amount);
		} else {
			System.out.println("insufficient balance " + Amount);
		}
	}

	@Override
	public void calculateInterest() {
		System.out.println("Interest for the salary account is 0");
	}

	@Override
	public void displayAccountDetails() {
		System.out.println(Name);
		System.out.println(Address);
		System.out.println(Amount);

	}
}

public class BankingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter Amount");
		double Amount = sc.nextDouble();

		sc.nextLine();

		System.out.println("enter Name");
		String name = sc.nextLine();

		System.out.println("enter Address");
		String Address = sc.nextLine();

		BankAccount account;
		account = new BankAccount(Amount, name, Address);

		account.deposit(5000);
		account.withdraw(2000);
		account.calculateInterest();
		account.displayAccountDetails();

		account = new SavingsAccount(Amount, name, Address);
		account.deposit(5000);
		account.withdraw(2000);
		account.calculateInterest();
		account.displayAccountDetails();

		account = new CurrentAccount(Amount, name, Address);
		account.deposit(5000);
		account.withdraw(12000);
		account.calculateInterest();
		account.displayAccountDetails();

		account = new SalaryAccount(Amount, name, Address);
		account.deposit(30000);
		account.withdraw(5000);
		account.calculateInterest();
		account.displayAccountDetails();

		sc.close();

	}

}
