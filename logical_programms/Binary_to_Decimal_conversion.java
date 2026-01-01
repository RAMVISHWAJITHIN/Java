import java.util.Scanner;

public class Binary_to_Decimal_conversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int power = 0;
        int decimal = 0;
        while (n > 0) {
            int ld = n % 10;
            if (ld == 1) {
                int expo = 1;
                for (int i = 1; i <= power; i++) {
                    expo = expo * 2;
                }
                decimal = decimal + expo;
            }
            power++;
            n = n / 10;
        }
        System.out.println(" the decimal to binary:" + decimal);
    }
}
