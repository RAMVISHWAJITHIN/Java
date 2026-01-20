import java.util.Scanner;

public class NthLargestDigit {

    public static int nthLarge(int num, int n) {
        // num=9785,n=3
        int count = 0;
        for (int i = 9; i >= 0; i--) {
            int temp = num;
            while (temp > 0) {
                int ld = temp % 10;

                if (ld == i) {
                    count++;
                    break;
                }

                temp = temp / 10;

            }

            if (count == n) {
                return i;
            }

        }
        return -1;

    }

    public static int nthSmallest(int num, int n) {
        // num=9785,n=3
        int count = 0;
        for (int i = 1; i <= 9; i++) {
            int temp = num;
            while (temp > 0) {
                int ld = temp % 10;
                if (ld == i) {
                    count++;
                    break;
                }
                temp = temp / 10;

            }
            if (count == n) {
                return i;
            }

        }
        return -1;
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;

        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();
        int len = countDigits(num);
        if (n <= len) {
            System.out.println(n + ": largest number in " + num + " " + nthLarge(num, n));
            System.out.println(n + ": smallest number  in " + num + " " + nthSmallest(num, n));
        } else {
            System.out.println("can't possible Nthlargest ");
        }

    }
}
