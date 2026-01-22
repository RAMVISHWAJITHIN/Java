// package DynamicProgramming;
public class fibonacci {
    public static int fib(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // public static int fib(int n, int f[]) { // memoization-top down approach
    // if (n == 0 || n == 1) {
    // return n;
    // }
    // if (f[n] != 0) {
    // return f[n];
    // }
    // f[n] = fib(n - 1, f) + fib(n - 2, f);
    // return f[n];
    // }

    /*
     * Dry Run Example
     * 
     * Let’s take:
     * 
     * n = 5
     * f = new int[6]; // [0, 0, 0, 0, 0, 0]
     * 
     * Step-by-step Execution
     * Call 1: fib(5, f)
     * 
     * f[5] == 0
     * 
     * Compute → fib(4) + fib(3)
     * 
     * Call 2: fib(4, f)
     * 
     * f[4] == 0
     * 
     * Compute → fib(3) + fib(2)
     * 
     * Call 3: fib(3, f)
     * 
     * f[3] == 0
     * 
     * Compute → fib(2) + fib(1)
     * 
     * Call 4: fib(2, f)
     * 
     * f[2] == 0
     * 
     * Compute → fib(1) + fib(0)
     * 
     * Base Cases
     * 
     * fib(1) = 1
     * 
     * fib(0) = 0
     * 
     * So:
     * 
     * f[2] = 1 + 0 = 1
     * 
     * 
     * f = [0, 0, 1, 0, 0, 0]
     * 
     * Back to fib(3)
     * 
     * fib(1) = 1
     * 
     * f[3] = 1 + 1 = 2
     * 
     * 
     * f = [0, 0, 1, 2, 0, 0]
     * 
     * Back to fib(4)
     * 
     * fib(2) already computed → 1
     * 
     * f[4] = 2 + 1 = 3
     * 
     * 
     * f = [0, 0, 1, 2, 3, 0]
     * 
     * Back to fib(5)
     * 
     * fib(3) already computed → 2
     * 
     * f[5] = 3 + 2 = 5
     * 
     * 
     * f = [0, 0, 1, 2, 3, 5]
     */
    public static void main(String[] args) {
        int n = 10;
        int f[] = new int[n + 1];
        // System.out.println(fib(n, f));
        System.out.println(fib(n));
    }
}
