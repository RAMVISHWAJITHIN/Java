
import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius:");
        double a = sc.nextInt();
        double pi = 3.14;
        double area = pi * a * a;
        System.out.println("area of circle :" + area);

    }
}
