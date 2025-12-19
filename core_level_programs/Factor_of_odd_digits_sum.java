import java.util.Scanner;

public class Factor_of_odd_digits_sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number");
        int n = sc.nextInt();
        while (n > 0) {
            int ld = n % 10;
            if (ld % 2 != 0) {
                int sum = 0;
                for (int i = 1; i <= ld; i++) {
                    if (n % i == 0) {
                        sum = sum + i;
                    }

                }
                System.out.println(" the sum of odd factors of digit :" + sum);
            }
            n = n / 10;
        }
    }
}
