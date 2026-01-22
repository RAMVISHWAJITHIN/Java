public class LucasSeries {

    public static void lucas(int n) {

        int a = 2, b = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        lucas(5);
    }
}
