
import java.util.Scanner;

public class sum_of_even_factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 0) {
                sum = sum + i;
            }

        }
        System.out.println(" the sum of even numbers factors : " + sum);
    }
}
