package bitwise;
import java.util.Scanner;
public class Q17 {
    public static boolean isEven(int num) { 
        return (num & 1) == 0; 
    } 
 
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter a number:");
        int num = sc.nextInt(); // Example input 
        System.out.println("Is even: " + isEven(num)); 
    }
}
