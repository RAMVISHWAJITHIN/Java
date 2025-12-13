import java.util.Scanner;

public class Swapping_Of_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        // int temp = a;
        // a = b;
        // b = temp;
        // without third variable
        // a = a + b;
        // b = a - b;
        // a = a - b;
        // or
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println(" the swapping of numbers of  " + a + " and " + b + ":" + a + "," + b);
    }
}
