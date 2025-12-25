
// num=1234
// 256+
//     81+
//     16+
//     1+

import java.util.Scanner;

public class sum_of_exponential_value_of_Each_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int ld = num % 10;
            int power = 1;
            for (int i = 1; i <= n; i++) {
                power = power * ld;
            }
            sum = sum + power;
            System.out.println("power:" + power);
            num = num / 10;
        }
        System.out.println("the sum :" + sum);
    }

}
