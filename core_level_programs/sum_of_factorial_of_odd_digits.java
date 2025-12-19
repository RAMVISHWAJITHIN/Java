import java.util.Scanner;

public class sum_of_factorial_of_odd_digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            if (ld % 2 != 0) {
                System.out.println(" the factorial of odd digit :" + ld);

                int fact = 1;
                for (int i = 1; i <= ld; i++) {
                    fact = fact * i;

                }
                sum = fact + sum;

                System.out.println("the  factorial  of sum of odd digits:" + sum);
            }
            n = n / 10;
        }
        if (sum % 2 == 0) {
            System.out.println(sum + " :is even");
        }

    }
}
