import java.util.Scanner;

public class HarshadNumberSeries {

    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter number");
    // int n = sc.nextInt();
    // int temp = n;
    // int sum = 0;
    // while (n > 0) {
    // int ld = n % 10;
    // sum = sum + ld;
    // n = n / 10;
    // }
    // if (temp % sum == 0) {
    // System.out.println(" it is a harshad number");
    // } else {
    // System.out.println("not a harshad number");
    // }
    public static boolean checkHarshad(int n) {

        int temp = n;
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            sum = sum + ld;
            n = n / 10;
        }
        return temp % sum == 0;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1;; i++) {
            if (checkHarshad(i)) {
                System.out.print(i + " ");
                count++;

            }
            if (count == n) {
                break;
            }
        }
        System.out.println();

    }
}
