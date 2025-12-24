//exponential value of the given number to the power of the prime digits present in the given number

import java.util.Scanner;

public class Exponential_count_prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter num");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (n > 0) {
            int ld = n % 10;
            int primeCount = 0;
            for (int i = 1; i <= ld; i++) {
                if (ld % i == 0) {
                    primeCount++;
                }
            }
            if (primeCount == 2) {
                System.out.println(ld + "is prime");
                count++;
            }
            n = n / 10;
        }
        if (count > 0) {
            int expo = 1;
            for (int i = 1; i <= count; i++) {
                expo = expo * temp;
            }
            System.out.println("exponential of prime" + expo);

        } else {
            System.out.println("NO prime digits");
        }
    }
}
