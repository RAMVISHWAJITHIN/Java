//1.WAJP  create a method,to find the factorial of a given number.
// the method should accept an integer value of an argument and return the result.

//wajp to find sum of the digits present in the given Number.
//create a method that accepts an integer number as argument.and return the result.

public class WithReturnTypeAndWithPara {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            sum = sum + ld;
            n = n / 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("main starts");
        System.out.println(sum(10, 20));
        System.out.println("factorial :" + fact(5));
        System.out.println("the sum of digits:" + sumOfDigits(124));
        System.out.println("main endsss");
    }
}
