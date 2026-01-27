import java.util.Scanner;

public class HcfOfGivenNumbers {

    public static void main(String[] args) {
        int n1 = 30, n2 = 16, n3 = 9;
        int end = (n1 <= n2) ? ((n1 <= n3) ? n1 : n3) : ((n2 <= n3) ? n2 : n3);
        // System.out.println(end);
        int hcf = 0;
        for (int i = 1; i <= end; i++) {
            hcf = i;
        }
        System.out.println(hcf);
    }
}
