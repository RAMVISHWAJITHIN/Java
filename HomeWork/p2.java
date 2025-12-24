// package HomeWork;

import java.util.Scanner;

public class p2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            sum = sum + ld;
            n = n / 10;
        }
        System.out.println("sum of digits:" + sum);
        int count = 0;
        int temp = sum;
        while (sum > 0) {
            sum = sum / 10;
            count++;

        }
        System.out.println("the count of digits :" + count);
        int exponential = 1;
        for (int i = 1; i <= count; i++) {
            exponential = temp * exponential;
        }
        System.out.println("the exponential value :" + exponential);
    }
}
