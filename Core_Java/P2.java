
public class P2 {

    static int a = 50 + 50 + 50;
    static boolean s;

    public static void add() {
        System.out.println("ab");
        System.out.println(P2.a);
        P2.s = true;
        System.out.println("ac");
    }

    public static void main(String[] args) {
        System.out.println("mb");
        System.out.println(a);
        System.out.println(s);
        double a = 10.5;
        int s = 5;
        System.out.println(s);
        System.out.println(P2.a);
        P2.add();
        System.out.println("me");
    }
}
