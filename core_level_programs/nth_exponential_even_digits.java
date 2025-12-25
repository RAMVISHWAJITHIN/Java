
// i/p:num=1234
// n=4
// sum of the exponential value of given digits to the power of 4=272

import java.util.Scanner;

public class nth_exponential_even_digits {

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
            if (ld % 2 == 0) {
                for (int i = 1; i <= n; i++) {
                    power = power * ld;
                }
                sum = sum + power;
            }
            num = num / 10;
        }
        System.out.println("sum:" + sum);
    }
}
