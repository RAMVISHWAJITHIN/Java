import java.util.Scanner;

public class Exponential_of_numbers_of_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int num = sc.nextInt();

        while (num > 0) {
            int ld = num % 10;
            int powerofdigit = 1;
            for (int i = 1; i <= ld; i++) {
                powerofdigit = powerofdigit * ld;
            }
            System.out.println("the power of digit :" + powerofdigit);
            num = num / 10;
        }
    }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter n");
    // int num = sc.nextInt();
    // System.out.println("to the required power");
    // int n = sc.nextInt();

    // while (num > 0) {
    // int ld = num % 10;
    // int powerofdigit = 1;
    // for (int i = 1; i <= n; i++) {
    // powerofdigit = powerofdigit * ld;
    // }
    // System.out.println("the power of digit :" + powerofdigit);
    // num = num / 10;
    // }
    // }
}
