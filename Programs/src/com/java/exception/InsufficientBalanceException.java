package com.java.exception;

public class InsufficientBalanceException extends Exception {

	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException() {
		super();
		System.out.println("IInsufficientBalanceException.InsufficientBalanceException(0-param)");
	}

	public InsufficientBalanceException(String message) {
		super(message);
		System.out.println("InsufficientBalanceException.IInsufficientBalanceException(msg-param)");
	}

}
