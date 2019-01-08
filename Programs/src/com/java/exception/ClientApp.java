package com.java.exception;

public class ClientApp {

	public static void main(String[] args) throws InvalidAmountException, InsufficientBalanceException {

		HDFCBank b = new HDFCBank();

		b.setBalance(-2506.00);

		b.withdraw(-25);

		b.balanceEnquiry();
	}

}
