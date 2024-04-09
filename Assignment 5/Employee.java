package day05_assignment;

import java.util.Scanner;

public abstract class Employee implements Acceptable, Display{
	 String firstName;
	 String lastName;
	 int ssn;
	@Override
	public void displayData() {
		System.out.println("name of employee - "+firstName+" "+lastName);
		System.out.println("social security number - "+ssn);
	}
	@Override
	public void acceptData() {
		System.out.print("Enter employee first name - ");
		Scanner sc = new Scanner(System.in);
		firstName = sc.next();
		System.out.print("Enter employee last name - ");
		lastName = sc.next();
		System.out.print("Enter social security number  - ");
		ssn = sc.nextInt();
	}
	 
	public abstract void calculateSalary();
	 

}
