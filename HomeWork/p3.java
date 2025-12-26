import java.util.Scanner;

public class p3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            if (n % 2 == 0) {
                count++;
            }

        }
        System.out.println("count :" + count);
        while (temp > 0) {
            int ld = temp % 10;
            int expo = 1;
            for (int i = 1; i <= count; i++) {
                expo = expo * ld;
            }
            System.out.println("Exponential of power" + expo);
            temp = temp / 10;
        }

    }
}
