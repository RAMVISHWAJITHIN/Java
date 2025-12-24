import java.util.Scanner;

public class Cube_of_digits_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        while (n > 0) {
            int ld = n % 10;
            int cube = ld * ld * ld;
            System.out.println("cube of " + ld + ":" + cube);
            n = n / 10;
        }
    }

}
