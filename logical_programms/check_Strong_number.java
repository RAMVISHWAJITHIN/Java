import java.util.Scanner;

public class check_Strong_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            int fact = 1;
            for (int i = 1; i <= ld; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;

        }
        System.out.println(sum);
        if (temp == sum) {
            System.out.println("it is factorial number");
        } else {
            System.out.println(" it is not factorial number");
        }
    }
}
