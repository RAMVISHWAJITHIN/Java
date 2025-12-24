import java.util.Scanner;

public class Exponential_of_numbers_of_even_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        System.out.println("to the required power");
        int n = sc.nextInt();

        while (num > 0) {
            int ld = num % 10;
            if (ld % 2 == 0) {
                int powerofdigit = 1;
                for (int i = 1; i <= n; i++) {
                    powerofdigit = powerofdigit * ld;
                }
                System.out.println(n + " to the power " + ld + " of digit :" + powerofdigit);
            }

            num = num / 10;
        }
    }
}
