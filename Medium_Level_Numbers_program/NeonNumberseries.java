import java.util.Scanner;

public class NeonNumberseries {

    public static int checkNeon(int n) {
        // 9
        // 81

        int sum = 0;
        int sq = n * n;
        while (sq > 0) {
            sum += sq % 10;
            sq = sq / 10;

        }
        // System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i == checkNeon(i)) {
                System.out.print(i + " ");

            }

        }
        System.out.println();

    }
}