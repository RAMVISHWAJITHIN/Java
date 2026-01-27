import java.util.Scanner;

public class NthFinderFibonacci {

    public static void checkFib(int n) {
        if (n == 0) {
            System.out.println(1);
        } else if (n == 1) {
            System.out.println(2);

        } else {
            int a = 1;
            int b = 2;
            for (int i = 1;; i++) {

                if (b == n) {
                    System.out.println(n + " is a fibonacii number");
                    break;
                }

                else if (b > n) {
                    System.out.println(n + " is not a fibonacii number");
                    break;
                }
                int c = a + b;
                a = b;
                b = c;

            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        checkFib(n);
        // if (n == 0) {
        // System.out.println(1);
        // } else if (n == 1) {
        // System.out.println(2);

        // } else {
        // int a = 1;
        // int b = 2;
        // for (int i = 1;; i++) {
        // if (b > n) {
        // System.out.println(b);
        // break;
        // }
        // int c = a + b;
        // a = b;
        // b = c;

        // }

        // }
    }
}
