import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int product = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                product = product * i;
            }
        }
        System.out.println("the product is :" + product);
        int count = 0;
        int temp = product;
        while (product > 0) {
            product = product / 10;
            count++;
        }
        System.out.println("the count of digits :" + count);
        int exponential = 1;
        for (int i = 1; i <= count; i++) {
            exponential = temp * exponential;
        }
        System.out.println("the exponential value :" + exponential);
    }

}
