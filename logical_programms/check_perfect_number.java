import java.util.Scanner;

public class check_perfect_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number");
        int n = sc.nextInt();
        int product = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                product = product + i;
            }

        }
        if (product == n) {
            System.out.println("it is perfect number");
        } else {
            System.out.println("it is not perfect number ");
        }
    }
}
