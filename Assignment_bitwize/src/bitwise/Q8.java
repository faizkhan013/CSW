package bitwise;

public class Q8 {
    public static int reverse(int num) { 
        int result = 0; 
        boolean isNegative = num < 0; 
        num = Math.abs(num); 
        while (num > 0) { 
            result = result * 10 + num % 10; 
            num /= 10; 
        } 
        return isNegative ? -result : result; 
    } 
 
    public static void main(String[] args) { 
        int num = -245; 
        System.out.println("Reversed: " + reverse(num)); 
    }
}
