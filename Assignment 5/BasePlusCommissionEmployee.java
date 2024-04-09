package day05_assignment;

import java.util.Scanner;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	double baseSalary;
	@Override
	public void calculateSalary() {
		double totalSal;
		totalSal = (commissionRate * grossSalse) + baseSalary;
		System.out.println("total salary = "+ totalSal);
	}

	@Override
	public void displayData() {
		
		super.displayData();
		System.out.println("base salary = "+baseSalary);
	}

	@Override
	public void acceptData() {
		
		super.acceptData();
		System.out.print("enter base salary = ");
		Scanner sc = new Scanner(System.in);
		baseSalary = sc.nextInt();
	}
	public void bonus()
	{
		double salary;
		salary = (commissionRate * grossSalse) + baseSalary + baseSalary*0.1;
		System.out.println("total salary  with Bonus= "+ salary);
	}

}
