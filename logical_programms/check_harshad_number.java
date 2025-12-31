import java.util.Scanner;

public class check_harshad_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            sum = sum + ld;
            n = n / 10;
        }
        if (temp % sum == 0) {
            System.out.println(" it is a harshad number");
        } else {
            System.out.println("not a harshad number");
        }
    }
}
