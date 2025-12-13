// package Medium_Level_Numbers_program;

import java.util.Scanner;

public class sum_of_factors_of_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println(" the sum of factors of given number. :" + sum);
    }
}
