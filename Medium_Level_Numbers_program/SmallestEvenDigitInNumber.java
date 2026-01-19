import java.util.Scanner;

public class SmallestEvenDigitInNumber {

    public static int EvenDigit(int n) {
        int smallest = 9;
        while (n > 0) {
            int ld = n % 10;
            if (ld % 2 == 0 && ld < smallest && ld != 0) {
                smallest = ld;
            }
            n = n / 10;
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
        if (n > 0) {
            int smallestEven = EvenDigit(n);
            if (smallestEven < 9 & smallestEven != 0) {
                System.out.println("smallest even digit is:" + smallestEven);
            } else {
                System.out.println("No even Digits");
            }
        } else {
            System.out.println("entered number is zero");
        }
    }
}
