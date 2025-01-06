package bitwise;
import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	System.out.print("Enter the starting number:");
        int start = sc.nextInt();
        System.out.print("Ennter the ending number:");
        int end = sc.nextInt(); // Example range 
        for (int num = start; num <= end; num++) { 
            boolean isPrime = true; 
            if (num < 2) continue; // Skip numbers less than 2 
            for (int i = 2; i <= Math.sqrt(num); i++) { 
                if (num % i == 0) { 
                    isPrime = false; 
                    break; 
                } 
            } 
            if (isPrime) { 
                System.out.print(num + " "); 
            } 
        } 
    }
}
