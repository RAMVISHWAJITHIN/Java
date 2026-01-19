public class LargestOddDigitNumber {

    public static int oddLargest(int n) {
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

    public static int oddsmallest(int n) {
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
        System.out.println(oddLargest(12353));
        System.out.println(oddsmallest(12358));
        ;
    }
}
