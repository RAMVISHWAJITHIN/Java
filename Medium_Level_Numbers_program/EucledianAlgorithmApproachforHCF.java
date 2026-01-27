public class EucledianAlgorithmApproachforHCF {

    public static void lcm(int a, int b, int hcf) {
        int lcm = (a * b) / hcf;
        System.out.println("lcm :" + lcm);

    }

    public static void main(String[] args) {

        int a = 4, b = 6;
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        int a1 = 4, b1 = 6;
        int hcf = a;
        System.out.println(a);
        lcm(a1, b1, hcf);
    }

}
