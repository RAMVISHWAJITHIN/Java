import java.util.Scanner;

public class HowWork {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();
        int cube_formula = (a * a * a + b * b * b + 3 * a * a * b + 3 * b * b * a);
        System.out.println("cube formula. " + cube_formula);
    }
}
