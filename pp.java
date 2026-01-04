import java.util.Scanner;

public class pp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int digits = String.valueOf(n).length();
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            sum += Math.pow(ld, digits);
            digits--;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("dis");

        } else {
            System.out.println("not disor");
        }

        // int r = Integer.parseInt(n, 2);
        // System.out.println(r);
        // int s = Integer.parseInt(Integer.toBinaryString(m));
        // System.out.println(s);

    }
}