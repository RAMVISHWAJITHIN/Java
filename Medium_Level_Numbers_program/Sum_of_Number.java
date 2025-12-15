import java.util.Scanner;

public class Sum_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            sum = sum + lastdigit;
            n = n / 10;
        }
        System.out.println("the sum of digits :" + sum);
    }
}
