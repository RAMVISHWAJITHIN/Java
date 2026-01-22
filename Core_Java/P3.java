//we can exceutw before main method with the help of static keyword other than void

public class P3 {

    static int a = 5 + 5 + 5;
    static int i = P3.test();

    public static void main(String[] args) {
        System.out.println("mb");
        System.out.println(a);
        System.out.println(i);
        double d = 50.0 + P3.test();
        System.out.println(d);
        System.out.println("me");

    }

    public static int test() {
        System.out.println("tb");
        System.out.println("te");
        return 500;
    }
}
