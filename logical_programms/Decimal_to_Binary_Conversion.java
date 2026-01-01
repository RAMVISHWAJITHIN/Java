import java.util.Scanner;

public class Decimal_to_Binary_Conversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n = sc.nextInt();
        int place = 1;
        int binary = 0;
        while (n > 0) {
            int rem = n % 2;
            binary = binary + (rem * place);
            place = place * 10;
            n = n / 2;

        }
        System.out.println(" the binary number is :" + binary);
    }
}
