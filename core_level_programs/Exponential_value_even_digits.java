import java.util.Scanner;

public class Exponential_value_even_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number num");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (num > 0) {
            int ld = num % 10;
            if (ld % 2 == 0) {
                count++;
            }

            num = num / 10;

        }
        System.out.println(count);
        if (count > 0) {
            int exponential = 1;
            for (int i = 1; i <= count; i++) {
                exponential = exponential * temp;

            }
            System.out.println(exponential);

        } else {
            System.out.println("NO even digits present");
        }

    }

}
