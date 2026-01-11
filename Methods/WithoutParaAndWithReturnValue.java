public class WithoutParaAndWithReturnValue {

    public static int m1() {
        System.out.println("m1 starts");
        int a = 10;
        return a;
    }

    public static void main(String[] args) {
        System.out.println("main starts");
        System.out.println(m1());
        System.out.println("Main ends");
    }
}
