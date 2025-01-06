package bitwise;

public class Q7 {
	  public static int power(int x, int y) { 
	        int result = 1; 
	        while (y > 0) { 
	            if ((y & 1) == 1) result *= x; 
	            x *= x; 
	            y >>= 1; 
	        } 
	        return result; 
	    } 
	 
	    public static void main(String[] args) { 
	        int x = 2, y = 3; 
	        System.out.println("Result: " + power(x, y)); 
	    }
}
