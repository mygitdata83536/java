package day05_assignment;

import java.util.Scanner;

public class SalariedEmployee extends Employee {

	double weeklySalary;

	
	public SalariedEmployee() {
		super();
	}


	@Override
	public void displayData() {
		
		super.displayData();
		System.out.println("weekly salary of employee = "+weeklySalary);
		
	}


	@Override
	public void acceptData() {
		
		super.acceptData();
		System.out.print("enter weekly salary = ");
		Scanner sc = new Scanner(System.in);
		weeklySalary = sc.nextDouble();
	}


	@Override
	public void calculateSalary() {
		System.out.println("total salary of employee =  "+weeklySalary);
		
	}
}
