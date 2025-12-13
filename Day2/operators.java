
import java.util.*;

public class operators {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        return a / b;

    }

    public static double modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();
        System.out.println("sum is  " + add(a, b));

        System.out.println("product is. " + multiply(a, b));
        System.out.println("division(quotient) is " + division(a, b));
        System.out.println("modulus(remainder) is " + modulus(a, b));
    }
}
