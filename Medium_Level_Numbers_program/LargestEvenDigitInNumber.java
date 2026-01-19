import java.util.Scanner;

public class LargestEvenDigitInNumber {

    public static int EvenDigit(int n) {
        int largest = 0;
        while (n > 0) {
            int ld = n % 10;
            if (ld % 2 == 0 && ld > largest) {
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
            int largestEven = EvenDigit(n);
            if (largestEven > 0) {
                System.out.println("largest even digit is:" + largestEven);
            } else {
                System.out.println("No even Digits");
            }
        } else {
            System.out.println("entered number is zero");
        }
    }
}
