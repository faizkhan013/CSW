package bitwise;

public class Q10 {
    public static void main(String[] args) { 
        float num1 = 3.14f, num2 = 3.141f; 
        float epsilon = 0.01f; 
        System.out.println("Difference < epsilon: " + (Math.abs(num1 - num2) < epsilon)); 
    } 
}
