// package day3;

import java.util.Scanner;

public class Pass_Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Telugu marks out of 100: ");
        double Telugu = sc.nextDouble();
        System.out.println("enter Hindi marks out of 100: ");
        double Hindi = sc.nextDouble();
        System.out.println("enter English marks  out of 100: ");
        double English = sc.nextInt();
        System.out.println("enter Mathmatics marks out of 100: ");
        double Maths = sc.nextDouble();
        System.out.println("enter Physics marks out of 50: ");
        double physics = sc.nextDouble();
        System.out.println("enter biology marks out of 50: ");
        double biology = sc.nextDouble();
        System.out.println("enter social marks out of 100: ");
        double social = sc.nextDouble();
        double Total_sum = Telugu + Hindi + English + Maths + physics + biology + social;
        double percenatge = (Total_sum / 600) * 100;
        if (percenatge > 35) {

            System.out.println("total marks is" + Total_sum + " and final result is pass");
        } else {
            System.out.println("fails");
        }

    }
}
