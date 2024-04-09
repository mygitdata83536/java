package day05_assignment;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	int wage;
	int hours;
	
	public HourlyEmployee() {
		super();
	}
	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		super.displayData();
		System.out.println("hourly wages = "+wage);
		System.out.println("hour worked = "+hours);
		
		
	}
	@Override
	public void acceptData() {
		// TODO Auto-generated method stub
		super.acceptData();
		System.out.print("enter weekly salary = ");
		Scanner sc = new Scanner(System.in);
		wage = sc.nextInt();
		System.out.print("enter weekly salary = ");
		hours = sc.nextInt();
	}
	@Override
	public void calculateSalary() {
		double totalSalary = 0;
		
	
		if (hours <= 40)
		{
			totalSalary = wage * hours;
		}
		else if (hours > 40)
		{
			totalSalary = 40*wage+(hours - 40)*wage*1.5;
		}
		System.out.println(" total salary = "+totalSalary);
	}
	

}
