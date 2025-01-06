package bitwise;
import java.util.Scanner;
public class Q12 {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the first number:");
	        int num1 = sc.nextInt();
	        System.out.print("Enter the second number:");
	        int num2 = sc.nextInt(); 
	        int combined = (num1 / 100) * 100 + (num2 % 100); 
	        System.out.println("Combined number: " + combined); 
	    }
}
