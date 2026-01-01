import java.util.Scanner;

public class ToCheckEvilNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int count = 0;
        int temp = n;

        while (temp > 0) {
            if (temp % 2 == 1) { // checking binary bit
                count++;
            }
            temp = temp / 2;
        }

        if (count % 2 == 0) {
            System.out.println(n + " is an Evil Number");
        } else {
            System.out.println(n + " is NOT an Evil Number");
        }

    }
}
