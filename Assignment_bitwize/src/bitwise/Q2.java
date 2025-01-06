package bitwise;

public class Q2 {
	
	    public static void main(String[] args) { 
	        int num = 7; // Example input 
	        int parity = 0; 
	        while (num > 0) { 
	            parity ^= (num & 1); 
	            num >>= 1; 
	        } 
	        System.out.println("Parity: " + parity); 
	    }
}
