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
            // System.out.println("first half:" + firsthalf);
            // System.out.println("second_half" + secondhalf);
            int rev = 0;
            while (secondhalf > 0) {
                int ld = secondhalf % 10;
                rev = rev * 10 + ld;
                secondhalf = secondhalf / 10;

            }
            // int totalsum = firsthalf + rev;
            System.out.println("rev:" + rev);
            // System.out.println(totalsum);
        }
    }
}
