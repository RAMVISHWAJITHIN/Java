
public class P1 {

    static int a = 50;
    static String s;

    public static void test() {
        System.out.println("tb");
        P1.s = "java";
        System.out.println("te");
    }

    public static void main(String[] args) {
        System.out.println("mb");
        System.out.println(a);
        System.out.println(s);
        P1.test();
        System.out.println(s);
        System.out.println("me");
    }
}
