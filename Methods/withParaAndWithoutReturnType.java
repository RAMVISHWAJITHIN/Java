import java.util.Scanner;

public class withParaAndWithoutReturnType {
    public static void m1(int a, char r) {
        System.out.println("a:" + a);
        System.out.println("char c:" + r1);
    }

    public static void m2(int b) {
        System.out.println("b:" + b);
    }

    public static void main(String[] args) {
        System.out.println("main method starts");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("entef c");
        char c = sc.next().charAt(0);
        m1(a, c);
        m2(b);
        System.out.println("Main Method ends");
    }

}
