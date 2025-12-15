import java.util.Scanner;

public class sum_product_total_factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
                product = product * i;
            }
        }
        total = sum + product;
        System.out.println("the sum of factors: " + sum);
        System.out.println("the product of factors :" + product);
        if (total % 2 == 0) {
            System.out.println("total sum is even : " + total);
        }

    }
}
