import java.util.Scanner;

public class Even_Number_and_Factor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        while (n > 0) {
            int ld = n % 10;
            if (ld % 2 == 0) {
                System.out.println("the factor of number :" + ld);
                for (int i = 1; i <= ld; i++) {
                    if (n % i == 0) {
                        System.out.println(i);
                    }
                }
            }
            n = n / 10;
        }

    }
}
