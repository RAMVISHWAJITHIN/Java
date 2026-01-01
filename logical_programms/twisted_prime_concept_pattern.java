import java.util.Scanner;

public class twisted_prime_concept_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        if (count % 2 == 0 && count > 3) {
            int div = 1;
            for (int i = 1; i <= count / 2; i++) {
                div = div * 10;

            }
            int firsthalf = temp / div;

            int secondhalf = temp % div;
            System.out.println("first half:" + firsthalf);
            System.out.println("second_half:" + secondhalf);
            int rev = 0;

            while (firsthalf > 0) {
                int ld = firsthalf % 10;
                rev = rev * 10 + ld;
                firsthalf = firsthalf / 10;

            }
            int totalsum = rev + secondhalf;
            System.out.println("rev:" + rev);
            System.out.println("total sum:" + totalsum);
            int prime = prime_logic(totalsum);

            int prim_num = prime_logic(prime);
            if (prim_num == 0) {
                System.out.println("not a prime");

            } else {
                int rev1 = 0;
                while (prim_num > 0) {
                    int ld = prim_num % 10;
                    rev1 = rev1 * 10 + ld;
                    prim_num = prim_num / 10;

                }
                System.out.println("rev prime" + rev);
                int reverse_prime = prime_logic(rev);
                if (reverse_prime > 0) {
                    System.out.println("it is twisted prime");
                } else {
                    System.out.println("not a twisted prime");
                }
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
