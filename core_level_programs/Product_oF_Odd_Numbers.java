import java.util.Scanner;

public class Product_oF_Odd_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m");
        int m = sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();
        int sum = 1;
        for (int i = m; i <= n; i++) {
            if (i % 2 == 1) {
                sum = sum + sum * i;
            }

        }
        System.out.println("the product of sum of odd numbers" + m + " and " + n + ":" + sum);
    }
}
