package com.sunbeaam.exceptions;

public class ExceptionLineTooLong extends Exception {
	
	String field;
	String messege;
	
	public ExceptionLineTooLong() {
		this.field="";
		this.messege="";
	}

	public ExceptionLineTooLong(String field)
	{
		this.field=field;
		this.messege="";
		
	}
	public ExceptionLineTooLong(String field, String messege) {
		
		this.field = field;
		this.messege = messege;
	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong [field=" + field + ", messege=" + messege + "]";
	}
	
	
//	@Override
//	public void printStackTrace() {
//		System.err.println("Exception : ");
//		System.err.println("InvalidDateException : " + messege);
//		System.err.println("For the field : " + field);
//	}
}
	