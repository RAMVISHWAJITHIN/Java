// package Medium_Level_Numbers_program;

import java.util.Scanner;

public class Product_oF_Factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number");
        int n = sc.nextInt();
        int product = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                product = product * i;
            }
        }
        System.out.println(" the product of factors :" + product);
    }
}
