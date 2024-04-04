package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;


public class TestPointArray1 {

	public static void main(String[] args) {

		Point2D p = new Point2D();
		Scanner sc1 = new Scanner(System.in);
		int num, choice, index, index2;

		System.out.println("Enter number of Point to be ploted: ");
		num = sc1.nextInt();
		Point2D[] arr = new Point2D[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Point2D();
			arr[i].accept();;
		}

		do {
			System.out.println("Press (1) to Display Specific Point");
			System.out.println("Press (2) to Display All Points");
			System.out.println("Press (3) to Find Distance between two Points");
			System.out.println("Press (4) to Exit");
			choice = sc1.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the Index");
				index = sc1.nextInt();
				if (index >= 0 && index < num)
					System.out.println(arr[index].getDetails());
				else
					System.out.println("Enter valid Index Value");
				break;
			case 2:
				for (Point2D element : arr) {
					System.out.println(element.getDetails());
					// System.out.println("Point= ("+element.getXaxis()+","+element.getYaxis()+")");
				}
				break;
			case 3:
				System.out.println("Enter the First Index");
				index = sc1.nextInt();
				if (index >= 0 && index < num) {
					System.out.println("Enter the Second Index");
					index2 = sc1.nextInt();
					if (index2 >= 0 && index2 < num) {
						if (arr[index].isEqual(arr[index2]))
							System.out.println("They Both Pointing Same Point");
						else 
							arr[index].calculateDistance(arr[index2]);
					} else
						System.out.println("Enter valid Index Value");
				} else
					System.out.println("Enter valid Index Value");
				break;
			case 4:
				System.out.println("Thank You");
				break;
			default:
				System.out.println("Enter correct choice");
				break;
			}

		} while (choice != 4);

	}

}