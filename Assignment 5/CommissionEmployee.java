package day05_assignment;

import java.util.Scanner;

public class CommissionEmployee  extends Employee{
	double grossSalse;
	double commissionRate;
	
	public CommissionEmployee() {
		super();
	}

	@Override
	public void calculateSalary() {
		double salary;
		salary = commissionRate * grossSalse;
		
	}

	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		super.displayData();
		System.out.println("grossSalse = "+grossSalse);
		System.out.println("commissionRate = "+commissionRate);
	}

	@Override
	public void acceptData() {
		// TODO Auto-generated method stub
		super.acceptData();
		System.out.print("enter gross sale = ");
		Scanner sc = new Scanner(System.in);
		grossSalse = sc.nextDouble();
		System.out.print("enter commission rate = ");
		commissionRate = sc.nextDouble();
	}

	
	
}
