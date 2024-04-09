package day05_assignment;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("****choose what you want to see : ****");
		System.err.println("1. salaried employee salary");
		System.err.println("2. hourly employee salary");
		System.err.println("3. commission employee salary");
		System.err.println("4. base plus commission employee salary");
		
		
		int choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		if (choice == 1)
		{
			Employee e1 = new SalariedEmployee();
			e1.acceptData();
			e1.displayData();
			e1.calculateSalary();
		}
		else if (choice == 2)
		{
			Employee e2 = new HourlyEmployee();
			e2.acceptData();
			e2.displayData();
			e2.calculateSalary();
		}
		else if (choice == 3)
		{
			Employee e3 = new CommissionEmployee();
			e3.acceptData();
			e3.displayData();
			e3.calculateSalary();
		}
		else if (choice == 4)
		{
			CommissionEmployee c1 = new BasePlusCommissionEmployee();
			c1.acceptData();
			c1.displayData();
			c1.calculateSalary();
			BasePlusCommissionEmployee base = (BasePlusCommissionEmployee) c1;
			base.bonus();
			
		}
		else 
		{
			System.out.println("*** you choice are quit wrong *** \n ****** thank you ******");
		}

	}

}
