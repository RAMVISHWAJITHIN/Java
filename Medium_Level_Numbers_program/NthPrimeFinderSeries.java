import java.util.Scanner;

public class NthPrimeFinderSeries {

    public static boolean checkPrime(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                count++;
            }

        }
        return count == 2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for (int i = n + 1;; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
                break;
            }
        }

    }
}
