import java.util.Scanner;

public class factorial_of_prime_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        while (n > 0) {
            int ld = n % 10;
            if (ld == 2 || ld == 3 || ld == 5 || ld == 7) {
                System.out.println(" the factorial prime digit" + ld);

                int fact = 1;
                for (int i = 1; i <= ld; i++) {
                    fact = fact * i;

                }
                System.out.println("the  factorial  of prime digits:" + fact);
            }
            n = n / 10;
        }
    }
}
