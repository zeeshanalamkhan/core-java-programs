package com.java.exception;

public interface Bank {

	public void deposite(double amt) throws InvalidAmountException;

	public double withdraw(double amt) throws InvalidAmountException, InsufficientBalanceException;

	public void balanceEnquiry();
}
