import java.util.Scanner;

public class Exponential_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base value");
        int x = sc.nextInt();
        System.out.println("enter power value ");
        int n = sc.nextInt();
        int expo = 1;
        for (int i = 1; i <= n; i++) {
            expo = expo * x;
        }
        System.out.println("the exponential of " + x + "to the power of " + n + ":" + expo);
    }
}

// import java.util.Scanner;

// public class Exponential_of_Number {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter base value");
// int x = sc.nextInt();
// System.out.println("enter power value ");
// int n = sc.nextInt();
// double expo = Math.pow(x, n);
// // for (int i = 1; i <= n; i++) {
// // expo = expo * x;
// // }

// System.out.println("the exponential of " + x + "to the power of " + n + ":" +
// expo);
// }
// }
