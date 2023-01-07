package com.bank.sprint1.exception;

public class TransactionNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	// using contructor passing message to display
	public TransactionNotFoundException(String message) {
		super(message);

	}
}
