package com.java.exception;

public class HDFCBank implements Bank {

	private double balance;

	/*
	 * public void setBalance(double balance) { this.balance = balance; }
	 */

	@Override
	public void deposite(double amt) throws InvalidAmountException {

		if (amt <= 0) {
			throw new InvalidAmountException("amount: " + amt + " is invalid amount");
		}
		balance = balance + amt;
	}

	@Override
	public double withdraw(double amt) throws InvalidAmountException, InsufficientBalanceException {

		if (amt <= 0) {
			throw new InvalidAmountException("amount: " + amt + " is invalid amount");
		}
		if (amt > balance) {
			throw new InsufficientBalanceException("amount: " + amt + " is insufficient amount");
		}

		balance = balance - amt;
		return amt;
	}

	@Override
	public void balanceEnquiry() {

		System.out.println("Your account current balance is: " + balance);

	}

	public void setBalance(double balance2) {
		this.balance = balance2;

	}

}
