// public package Medium_Level_Numbers_program;

import java.util.Scanner;

class Count_Factors_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println(" the total count of factors : " + count);
    }

}
// wajp tp count the fcators of a given number
// i/p:num=6
// o/p:total count of factors of 6=4