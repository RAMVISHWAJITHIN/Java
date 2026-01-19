public class SmallestPrimeDigitNumber {

    public static int smallestPrime(int n) {

        int smallest = 7;
        boolean found = false;
        while (n > 0) {
            int ld = n % 10;
            if ((ld == 2 || ld == 3 || ld == 5 || ld == 7) && ld < smallest) {

                smallest = ld;
                found = true;
            }

            n /= 10;
        }
        return found ? smallest : -1;
    }

    public static void main(String[] args) {
        System.out.println(smallestPrime(12358));
        System.out.println(smallestPrime(4689));
    }
}
