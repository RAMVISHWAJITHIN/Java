import java.util.Scanner;

public class ArmstrongSeries {

    public static boolean check_ArmstrongSeries(int n) {

        int temp = n;
        int sum = 0;
        int count = countDigits(n);
        while (n > 0) {
            int ld = n % 10;
            int expo = 1;
            for (int i = 1; i <= count; i++) {
                expo = expo * ld;

            }
            sum = sum + expo;
            n = n / 10;
        }
        return sum == temp;

    }

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter n");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1;; i++) {
            if (check_ArmstrongSeries(i)) {
                System.out.print(i + " ");
                count++;
            }
            if (count == n) {
                break;
            }
        }

    }
}
