import java.util.Scanner;

public class Hcf {

    public static void main(String[] args) {
        // int n1 = 5, n2 = 25, hcf = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter n1");
        int n1 = sc.nextInt();
        System.out.println("enter n2");
        int n2 = sc.nextInt();
        int hcf = 0;
        // if (n1 <= n2) {
        // hcf = n1;
        // } else {
        // hcf = n2;
        // }
        int end = n1 <= n2 ? n1 : n2;

        for (int i = 1; i <= end; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;

            }

        }
        System.out.println(hcf);
    }
}
