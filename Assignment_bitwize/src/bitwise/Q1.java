package bitwise;

public class Q1 {

	    public static void main(String[] args) { 
	        int num = 29; // Example input 
	        int count = 0; 
	        while (num > 0) { 
	            count += num & 1; 
	            num >>= 1; 
	        } 
	        System.out.println("Number of 1 bits: " + count); 
	    } 
	}

