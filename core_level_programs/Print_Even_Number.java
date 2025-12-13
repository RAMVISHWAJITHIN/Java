import java.util.Scanner;

public class Print_Even_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m");
        int m = sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}
