import java.util.Scanner;

public class sum_of_exponential_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number");
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        int sum = 0;
        while (n > 0) {
            n = n / 10;
            count++;

        }
        System.out.println("the count :" + count);
        while (temp > 0) {
            int ld = temp % 10;
            int expo = 1;
            for (int i = 1; i <= count; i++) {
                expo = expo * ld;

            }
            sum = sum + expo;
            temp = temp / 10;
            count--;
        }
        System.out.println("the sum :" + sum);
        // 123 3
    }

}
