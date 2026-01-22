import java.util.Scanner;

public class PalindromeSeries {

    public static boolean checkPalindrome(int num) {
        int rev = 0;
        int temp = num;
        while (num > 0) {
            int ld = num % 10;
            rev = rev * 10 + ld;
            num /= 10;
        }
        return temp == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter actual number");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1;; i++) {
            if (checkPalindrome(i)) {
                System.out.print(i + " ");
                count++;
            }
            if (count == n) {
                break;
            }
        }
        System.out.println();

    }
}
