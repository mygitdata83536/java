package com;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		int count = 0;

		System.out.println("Please enter the statement: ");
		str = sc.nextLine();

		str = str.trim(); 

		if (!str.isEmpty()) { 
			String[] words = str.split("\\s+"); 

			count = words.length; // Get the number of words
		}

		System.out.println("The number of words in the given string is: " + count);
	}
}

