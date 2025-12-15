import java.util.Scanner;

public class Print_Prime_Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int temp = n;
        System.out.println(" prime digits in " + n + ":");
        while (temp > 0) {
            int ld = temp % 10;
            if (ld == 2 || ld == 3 || ld == 5 || ld == 7) {
                System.out.println(ld);
            }
            temp = temp / 10;
        }
    }
}
