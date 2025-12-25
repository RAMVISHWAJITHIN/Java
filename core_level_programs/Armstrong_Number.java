import java.util.Scanner;

public class Armstrong_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        int sum = 0;
        num = temp;
        while (temp > 0) {
            int ld = temp % 10;
            int expo = 1;
            for (int i = 1; i <= count; i++) {
                expo = expo * ld;
            }
            sum = sum + expo;
            temp = temp / 10;
        }
        System.out.println(sum);
        if (num == sum) {
            System.out.println("number is armstrong");
        } else {
            System.out.println("number is not armstrong");
        }
    }
}
