import java.util.Scanner;

public class Exponential_count_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number num");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;

        }
        System.out.println(count);
        int exponential = 1;
        for (int i = 1; i <= count; i++) {
            exponential = exponential * temp;

        }
        System.out.println(exponential);

    }
}
