//3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
//2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
//When user enters 'Generate Bill' option , display total bill & exit.
//(No need of any class, and no need to display the food deatils. Only display the total of orderd
//food)

import java.util.*;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int total=0;
		int dosa,samosa,idli;
		Scanner sc = new Scanner(System.in);
		dosa=50;
		samosa=20;
		idli=25;
		
		
		do
		{	
			System.out.println("The food choices are ");
			System.out.println("0. Exit ");
			System.out.println("1. Dosa ");
			System.out.println("2. Samosa ");
			System.out.println("3. Idli ");
			System.out.println("4. Generate Bill");
			
			System.out.println("Enter your choice ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("dosa purchased ");
				total=total+dosa;
				break;
			case 2:
				System.out.println("Samosa purchased ");
				total=total+samosa;
				break;
			case 3:
				System.out.println("Idli purchased ");
				total=total+idli;
				break;
			case 4:
				System.out.println("The total bill is " +total);
				break;
			}
		}while( choice!=0 );

	}

}
