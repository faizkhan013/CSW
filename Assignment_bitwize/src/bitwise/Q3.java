package bitwise;

public class Q3 {
	
	    public static int swapBits(int num, int i, int j) { 
	        if (((num >> i) & 1) != ((num >> j) & 1)) { 
	            num ^= (1 << i) | (1 << j); 
	        } 
	        return num; 
	    } 
	 
	    public static void main(String[] args) { 
	        int num = 28, i = 0, j = 3; 
	        System.out.println("Before swapping: " + Integer.toBinaryString(num)); 
	        num = swapBits(num, i, j); 
	        System.out.println("After swapping: " + Integer.toBinaryString(num)); 
	    }
}
