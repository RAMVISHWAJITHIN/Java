import java.util.Scanner;

public class exponential_value_to_each_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        while (num > 0) {

            num = num / 10;
            count++;
        }
        while (temp > 0) {
            int ld = temp % 10;
            int power = 1;

            for (int i = 1; i <= count; i++) {
                power = power * ld;
            }
            System.out.println("power :" + power);
            temp = temp / 10;
        }

    }
}
