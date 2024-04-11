import java.util.Scanner;

public class Palin {
	

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
	
    public static void main(String[] args) {
    	String str;
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter a String- ");
    	str=sc.next();
    	
        //String str = "madam";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

}

