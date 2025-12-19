import java.util.Scanner;

public class Sum_of_factorial_of_Even_digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        while (n > 0) {
            int ld = n % 10;
            if (ld % 2 == 0) {
                System.out.println(" the factorial even digit" + ld);

                int fact = 1;
                for (int i = 1; i <= ld; i++) {
                    fact = fact * i;

                }
                System.out.println("the  factorial  of even digits:" + fact);
            }
            n = n / 10;
        }
    }
}
