import java.util.Scanner;

public class Square_of_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        while (n > 0) {
            int ld = n % 10;
            int square = ld * ld;
            System.out.println("square of " + ld + ":" + square);
            n = n / 10;
        }
    }
}
