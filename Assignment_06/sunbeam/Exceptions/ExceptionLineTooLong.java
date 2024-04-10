package com.sunbeam.Exceptions;

public class ExceptionLineTooLong extends Exception {
	private String message;

	public ExceptionLineTooLong() {
		message = "";
	}

	public ExceptionLineTooLong(String message) {
		this.message = message;
	}

	@Override
	public void printStackTrace() {
		System.err.println("Exception!!");
		System.err.println("ExceptionLineTooLong :" + message);

	}
}
