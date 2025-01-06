package bitwise;

public class Q15 {
	   public static void main(String[] args) { 
	        int count = 0, num = 2; 
	        while (count < 100) { 
	            boolean isPrime = true; 
	            for (int i = 2; i <= Math.sqrt(num); i++) { 
	                if (num % i == 0) { 
	                    isPrime = false; 
	                    break; 
	                } 
	            } 
	            if (isPrime) { 
	                System.out.println(num + " "); 
	                count++; 
	            } 
	            num++; 
	        } 
	    }
}
