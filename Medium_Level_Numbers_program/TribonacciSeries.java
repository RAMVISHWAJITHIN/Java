//print the first n terms of tribonacci series

public class TribonacciSeries {

    public static void tribonacci(int n) {
        int a = 0, b = 1, c = 1;

        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            int d = a + b + c;
            a = b;
            b = c;
            c = d;

        }
        System.out.println();

    }

    public static void main(String[] args) {
        tribonacci(10);
    }
}
