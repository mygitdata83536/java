package com.sunbeaam.userclass;

import java.util.Scanner;

import com.sunbeaam.exceptions.ExceptionLineTooLong;

public class Accstring {
	
	String s;
	int len;
	
	public void acceptString(Scanner sc)
	{
		System.out.println("Enter the string ");
		s=sc.next();
	}
	
	public void calculateString () throws ExceptionLineTooLong
	{
		len = s.length();
		if(len>80)
		throw new ExceptionLineTooLong("String", "The above field is more than 80 characters");
			
	}
}
