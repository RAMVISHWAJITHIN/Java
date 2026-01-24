public class FibonaciSeries {

    public static void fib(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    // public static int fibRec(int n) {
    // if (n == 0 || n == 1) {
    // return n;
    // }

    // return fibRec(n - 1) + fibRec(n - 2);
    // }

    public static void main(String[] args) {

        fib(10);
        // System.out.println(fibRec(10));
    }
}
