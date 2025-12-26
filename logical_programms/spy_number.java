
/*

num=123
sum of digits=6
prod of digits=6
it is spy number*/
import java.util.Scanner;

public class spy_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter num");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int ld = n % 10;
            sum = sum + ld;
            product = product * ld;
            n = n / 10;

        }
        if (sum == product) {
            System.out.println(temp + "  is a spy number");
        } else {
            System.out.println(temp + "not a spy number");
        }

    }
}
