import java.util.Scanner;

public class Sum_of_even_digits_of_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int ld = temp % 10;
            if (ld % 2 == 0) {
                sum = sum + ld;
            }
            temp = temp / 10;
        }
        System.out.println(" the sum of even digits of a number " + n + " : " + sum);

    }
}
