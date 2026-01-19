public class LargestDigitInNumber {

    public static int LargestDigit(int n) {
        if (n == 0) {
            return 0;
        }
        int largest = 0;
        while (n > 0) {
            int ld = n % 10;
            if (ld > largest) {
                largest = ld;
            }
            n = n / 10;
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println(LargestDigit(1234));
        System.out.println(LargestDigit(87934));
        System.out.println(LargestDigit(0));
    }
}
