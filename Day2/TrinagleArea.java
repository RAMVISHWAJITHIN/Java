// package Day2;

import java.util.Scanner;

public class TrinagleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();
        double areaTriangle = 0.5 * a * b;
        System.out.println("area of trinagle  :" + areaTriangle);
    }
}
