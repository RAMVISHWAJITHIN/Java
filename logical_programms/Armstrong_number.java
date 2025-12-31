import java.util.Scanner;

public class Armstrong_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number");
        int n = sc.nextInt();
        int temp = n;
        int a = n;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        int sum = 0;
        while (temp > 0) {
            int ld = temp % 10;
            int expo = 1;
            for (int i = 1; i <= count; i++) {
                expo = expo * ld;
            }
            sum = sum + expo;
            temp = temp / 10;
        }
        // System.out.println(sum);
        if (sum == a) {
            System.out.println("armstrong number");
        } else {
            System.out.println(" not armstrong number");
        }

    }
}
