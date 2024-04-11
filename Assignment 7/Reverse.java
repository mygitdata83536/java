    
        
        
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.next();
        
        String reversed = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed +  str.charAt(i);
        }
        
        System.out.println("Reversed string: " + reversed);
    }
}

