import java.util.Scanner;

public class Sum_of_Even_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m");
        int m = sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("the sum of even  numbers between m and n :" + sum);
    }

}
