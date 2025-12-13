// package Medium_Level_Numbers_program;

// prime number that exactly as two factors.
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(n + " prime number ");

        } else {
            System.out.println(n + " not a prime number");
        }
    }
}
