import java.util.Scanner;

public class to_check_twisted_prime_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();

        int prim_num = prime_logic(num);
        if (prim_num == 0) {
            System.out.println("not a prime");

        } else {
            int rev = 0;
            while (prim_num > 0) {
                int ld = prim_num % 10;
                rev = rev * 10 + ld;
                prim_num = prim_num / 10;

            }
            int reverse_prime = prime_logic(rev);
            if (reverse_prime > 0) {
                System.out.println("it is twisted prime");
            } else {
                System.out.println("not a twisted prime");
            }
        }

    }

    private static int prime_logic(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return n;
        }
        return 0;
    }
}
