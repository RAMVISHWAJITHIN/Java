import java.util.Scanner;

public class Print_sum_of_even_Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number");
        int n = sc.nextInt();
        int temp = n;
        while (temp > 0) {
            int ld = temp % 10;
            if (ld % 2 == 0) {
                System.out.println(" the even number :" + ld);
            }
            temp = temp / 10;
        }

    }
}
