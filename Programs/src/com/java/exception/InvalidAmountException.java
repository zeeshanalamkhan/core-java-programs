package com.java.exception;

public class InvalidAmountException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidAmountException() {
		super();
		System.out.println("InvalidAmountException.InvalidAmountException(0-param)");
	}

	public InvalidAmountException(String message) {
		super(message);
		System.out.println("InvalidAmountException.InvalidAmountException(msg-param)");
	}

}
