import java.util.*;

public class MultiplicationTable {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        int i = 1;
        while (i >= 1 && i <= 10) {
            System.out.println(n + " * " + i + "=" + 2 * i);
            i++;
        }
    }
}