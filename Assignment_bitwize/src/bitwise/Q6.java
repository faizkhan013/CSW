package bitwise;

public class Q6 {
    public static int divide(int x, int y) { 
        int result = 0; 
        while (x >= y) { 
            int tempY = y, multiple = 1; 
            while (x >= (tempY << 1)) { 
                tempY <<= 1; 
                multiple <<= 1; 
            } 
            x -= tempY; 
            result += multiple; 
        } 
        return result; 
    } 
 
    public static void main(String[] args) { 
        int x = 20, y = 4; 
        System.out.println("Quotient: " + divide(x, y)); 
    } 

}
