public class withParaAndWithoutReturnType {
    public static void m1(int a) {
        System.out.println("a:" + a);
    }

    public static void m2(int b) {
        System.out.println("b:" + b);
    }

    public static void main(String[] args) {
        System.out.println("main method starts");
        m1(10);
        m2(20);
        System.out.println("Main Method ends");
    }
}
