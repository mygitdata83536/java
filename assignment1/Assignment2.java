//Accept 2 double values from User (using Scanner). Check data type. If arguments are not
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.
//Hint : Check Scanner class for the methods

import java.util.*;

public class Assignment2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num1;
		double num2;
		double avg=0;
		
		System.out.println("Enter the two numbers");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		if(num1 == (double) num1 && num2 == (double) num2)
		{
			avg=(num1+num2)/2;
			System.out.println("The avarage is "+avg);
		}
		else
		{
			System.out.println("Something went wrong ");
		}
		
	}

}
