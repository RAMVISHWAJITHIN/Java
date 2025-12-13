import java.util.Scanner;

public class Count_of_Even_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m");
        int m = sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("the count of  numbers" + m + " and " + n + ":" + count);
    }
}
