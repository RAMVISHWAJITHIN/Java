import java.util.Scanner;

public class NthTwistedPrimeNumber {

    public static boolean checkPrime(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

        }
        return count == 2;
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1;; i++) {
            if (checkPrime(i)) {
                int reverse = reverse(i);
                if (checkPrime(reverse)) {
                    // System.out.print(i + " ");
                    count++;
                }
                if (count == n) {
                    System.out.print(i + " nth twisted prime number ");
                    break;
                }
            }

        }

        System.out.println();

    }
}
