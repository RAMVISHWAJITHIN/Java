public class SmallestDigitInNumber {

    public static int SmallestDigit(int n) {
        if (n == 0) {
            return 0;
        }
        int smallest = 9;
        while (n > 0) {
            int ld = n % 10;
            if (ld < smallest) {
                smallest = ld;
            }
            n = n / 10;
        }
        return smallest;
    }

    public static void main(String[] args) {
        System.out.println(SmallestDigit(1234));
        System.out.println(SmallestDigit(7894));

    }
}
