import java.util.Scanner;

public class total_product_of_factors_of_even_digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int totalproduct = 1;
        while (n > 0) {
            int ld = n % 10;
            int product = 1;
            System.out.println("Factors of " + ld);
            if (ld % 2 == 0) {
                for (int i = 1; i <= n; i++) {

                    if (ld % i == 0) {
                        product = product * i;
                    }
                }
            }
            totalproduct = totalproduct * product;
            n = n / 10;
        }
        System.out.println(totalproduct);
        int count = 0;
        for (int i = 1; i <= totalproduct; i++) {
            if (totalproduct % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("total product is prime");
        } else {
            System.out.println("total product is not prime");
        }
    }
}
