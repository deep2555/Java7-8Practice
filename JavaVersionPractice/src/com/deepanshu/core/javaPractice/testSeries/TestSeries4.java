package com.deepanshu.core.javaPractice.testSeries;

// encapsulation practice

class BankAccount {

	private int accountNumber;
	private double accountBalance;
	private String accountHolderName;

	public BankAccount(int accountNumber, String accountHolderName) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	// methods to withdraw and deposit money

	public double depositAmount(double amount) {

		if (amount <= 0) {
			System.out.println("invalid amount");
		} else {
			accountBalance += amount;
			System.out.println("the amount is added in your account!!");
			
		}
		
		return accountBalance;

	}

	public void withdrawAmount(double amount) {

		if (accountBalance <= 10) {
			System.out.println("you cannot withdraw amount please add more money to writhdraw!!!");
			System.out.println("your account balance is low!!");
		} else {
			accountBalance -= amount;
			System.out.println("the amount is deducted from your acconut ");
		}
	}

}

public class TestSeries4 {

	public static void main(String[] args) {
		
		BankAccount bcA = new BankAccount(001,"deepanshu");
		bcA.depositAmount(10);
		bcA.getAccountBalance();
		bcA.withdrawAmount(25);
		bcA.getAccountBalance();
	}
}
