public class NthFibonacciNumber {
    public static int fibRec(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibRec(n - 1) + fibRec(n - 2);
    }

    public static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int a = 0, b = 1, r = 0;

        for (int i = 2; i <= n; i++) {
            r = a + b;
            a = b;
            b = r;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(fib(10)); // nth Fibonacci
    }

}
