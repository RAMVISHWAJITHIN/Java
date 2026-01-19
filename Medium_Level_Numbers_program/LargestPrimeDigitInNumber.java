import java.util.Scanner;

public class LargestPrimeDigitInNumber {

    public static int primeDigit(int n) {

        int largest = 0;
        while (n > 0) {
            int ld = n % 10;
            if ((ld == 2 || ld == 3 || ld == 5 || ld == 7) && ld > largest) {
                largest = ld;
            }
            n = n / 10;
        }
        return largest;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
        if (n > 0) {
            int largePrime = primeDigit(n);
            System.out.println("the largest prime digit:" + largePrime);
        } else {
            System.out.println("you entered is zero");
        }

    }
}
