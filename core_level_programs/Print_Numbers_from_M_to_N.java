import java.util.Scanner;

public class Print_Numbers_from_M_to_N {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m");
        int m = sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.println(i);
        }
    }
}