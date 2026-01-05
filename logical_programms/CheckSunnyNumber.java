import java.util.Scanner;

public class CheckSunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int i = 1;
        while (true) {
            int product = i * i;
            if (product == n + 1) {
                System.out.println(n + " is a sunny Number");
                break;
            }
            if (product > n) {
                System.out.println(n + " is not a Sunny Number");
                break;
            }
            i++;
        }
    }
}
