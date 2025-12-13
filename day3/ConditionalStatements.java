// package day3;

import java.util.Scanner;

// 1.wajp to find the largest of two numbers.
//2.wajp to check whether the user is eligible to vot or not.
public class ConditionalStatements {
    public static void largest(int a, int b) {
        if (a > b) {
            System.out.println(a + "is largest ");
        } else {
            System.out.println(b + " is largest");
        }

    }

    public static void voteElgible(int a) {
        if (a >= 18) {
            System.out.println(" eligible to vote.");
        } else {
            System.out.println("not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();
        largest(a, b);
        voteElgible(a);

    }
}
