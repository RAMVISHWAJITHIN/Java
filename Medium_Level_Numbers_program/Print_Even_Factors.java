// package Medium_Level_Numbers_program;

import java.util.Scanner;

public class Print_Even_Factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 0) {
                System.out.println("even factors of num :" + i);
            }
        }
    }
}
