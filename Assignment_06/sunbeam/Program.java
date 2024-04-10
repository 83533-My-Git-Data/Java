/*Q1. Define a new exception, called ExceptionLineTooLong, that prints out the error message "The
strings is too long". Write a program that reads a String from user and calculates its length. and
throws an exception of type ExceptionLineTooLong in the case where a string of length is more
than 80 characters.
(Hint- Use String class length() method)*/

package com.sunbeam;

import java.util.Scanner;

import com.sunbeam.Exceptions.ExceptionLineTooLong;

public class Program {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) throws ExceptionLineTooLong {
		if (name.length() > 80)
			throw new ExceptionLineTooLong("The string is too long");
		this.name = name;
	}

}
