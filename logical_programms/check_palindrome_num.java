
import java.util.Scanner;

public class check_palindrome_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter n");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }
        if (temp == rev) {
            System.out.println(" number is palindrome");
        } else {
            System.out.println("no palindrome");
        }
    }
}
