import java.util.Scanner;

public class pp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int product = i * i;
            System.out.println("perfect:" + product);
        }

    }
}