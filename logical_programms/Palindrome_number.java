package logical_programms;

import java.util.Scanner;

public class Palindrome_number {
    Scanner sc = new Scanner(System.in);System.out.println(" enter n");
    int n = sc.nextInt();
    int rev = 0;while(n>0)
    {
        int ld = n % 10;
        rev = rev * 10 + ld;
        n = n / 10;
    }System.out.println("reverse of a number :"+rev);
}
