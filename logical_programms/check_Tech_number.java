import java.util.Scanner;

public class check_Tech_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;

        }
        System.out.println(count);

        if (count % 2 == 0) {
            int div = 1;
            for (int i = 1; i <= count / 2; i++) {
                div = div * 10;

            }
            int firsthalf = temp / div;
            // System.out.println("firsthalf" + firsthalf);

            int secondhalf = temp % div;
            // System.out.println("seconf half" + secondhalf);
            int sum = firsthalf + secondhalf;
            int square = sum * sum;
            if (square == temp) {
                System.out.println("tech number");

            } else {
                System.out.println("not a tech number");
            }

        } else {
            System.out.println("not possible splitting");
        }
    }
}
