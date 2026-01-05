import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int i = 1;
        while (true) {
            int product = i * i;
            if (product == n) {
                System.out.println(n + " is a perfect Square");
                break;
            }
            if (product > n) {
                System.out.println(n + " is not a  perfect Square");
                break;
            }
            i++;
        }
    }
}
