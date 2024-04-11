package com.sunbeaam.tester;

import java.util.Scanner;

import com.sunbeaam.userclass.Accstring;

public class Stringtester {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Accstring as=new Accstring();
		
		as.acceptString(sc);
		try {
		as.calculateString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Program Completed Successfully");
	}

}
