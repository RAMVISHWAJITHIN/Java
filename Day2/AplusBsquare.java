
import java.util.Scanner;

public class AplusBsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();
        int result = a * a + 2 * a * b + b * b;
        System.out.println("a + b whole square. " + result);
    }
}
