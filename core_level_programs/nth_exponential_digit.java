import java.util.Scanner;

public class nth_exponential_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();
        while (num > 0) {
            int ld = num % 10;
            int power = 1;
            for (int i = 1; i <= n; i++) {
                power = power * ld;
            }
            System.out.println("power:" + power);
            num = num / 10;
        }
    }
}
