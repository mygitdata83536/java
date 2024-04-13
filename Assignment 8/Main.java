import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student [] arr = new Student[4];
		arr[1] = new Student(100,"ganesh","chikhali",80.0);
		arr[2] = new Student(104,"tuntunu","s.nagar",98.0);
		arr[3] = new Student(103,"pari","nagpur",95.0);
		arr[0] = new Student(102,"mrunu","kolhapur",100.0);
		System.out.println("****RANDOM ARRAY****");
		for(Student element : arr)
		{
			System.out.println(element);
		}
	
	int choice;
	do {
		System.out.println("enter your choice ");
		System.out.println("1. sorted on their city (asc) ");
		System.out.println("2. sorted on their on marks (desc) ");
		System.out.println("3. sorted on their on name (asc) ");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch(choice) {
		case 0 :
			System.out.println("thank you .... ");
			break;
		case 1 :
			class CompareArr implements Comparator<Student> {

				@Override
				public int compare(Student arg0, Student arg1) {
					int value = arg0.getCity().compareTo(arg1.getCity());
					return value;
				}
			}
			Comparator<Student>  compareCity = new CompareArr();
			Arrays.sort(arr,compareCity);
			System.out.println("****SORTED ARRAY*****");
			for(Student element : arr)
			{
				System.out.println(element);
			}
			break;
		case 2 :
			class CompareArr implements Comparator<Student> {

				@Override
				public int compare(Student arg0, Student arg1) {
					int value = Double.compare(arg1.getMarks(), arg0.getMarks());
					return value;
				}
			}
			Comparator<Student>  compareMarks = new CompareArr();
			Arrays.sort(arr,compareMarks);
			System.out.println("****SORTED ARRAY*****");
			for(Student element : arr)
			{
				System.out.println(element);
			}
			break;

		case 3 :
			class CompareArr implements Comparator<Student> {

				@Override
				public int compare(Student arg0, Student arg1) {
					int value = arg0.getName().compareTo(arg1.getName());
					return value;
				}
			}
			Comparator<Student>  compareName = new CompareArr();
			Arrays.sort(arr,compareName);
			System.out.println("****SORTED ARRAY*****");
			for(Student element : arr)
			{
				System.out.println(element);
			}
			break;
		default :
			
			System.out.println("wrong choice .......");
	
		
		}
	}while(choice != 0);
}
}
