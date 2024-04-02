import java.util.*;
public class Assigment1 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number - ");
		num=sc.nextInt();
		System.out.println("The Binary equivalent is " + Integer.toBinaryString(num));
		System.out.println("The Octal equivalent is " + Integer.toOctalString(num));
		System.out.println("The hexadecimal equivalent is " + Integer.toHexString(num));
	}

}
