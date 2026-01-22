import java.util.Scanner;

public class PrimeNumberSeries {

    public static boolean checkPrime(int num) {

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1;; i++) {
            int num = i;
            if (checkPrime(num)) {
                System.out.print(num + " ");
                count++;

            }
            if (count == n) {
                break;
            }
        }
        System.out.println();

    }
}
