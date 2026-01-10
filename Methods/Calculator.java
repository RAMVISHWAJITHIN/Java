import java.util.Scanner;

public class Calculator {

    public static void add(int a, int b) {
        System.out.println("The addition of" + a + "and" + b + ":");
        System.out.println(a + b);

    }

    public static void sub(int a, int b) {
        System.out.println("The Substraction of" + a + "and" + b + ":");
        System.out.println(a - b);
    }

    public static void Multiply(int a, int b) {
        System.out.println("The Multiplication of" + a + "and" + b + ":");
        System.out.println(a * b);
    }

    public static void division(int a, int b) {
        System.out.println("The Division of" + a + "and" + b + ":");
        System.out.println(a / b);
    }

    public static void Modulus(int a, int b) {
        System.out.println("The Modulus of" + a + "and" + b + ":");
        System.out.println(a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println(
                "Select the type of operaton\n 1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Divison\n5.Modulus");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                add(a, b);

                break;
            case 2:
                sub(a, b);

                break;
            case 3:
                Multiply(a, b);

                break;
            case 4:
                division(a, b);

                break;
            case 5:
                Modulus(a, b);

                break;

            default:
                System.out.println("enter valid number");
                break;
        }
    }
}
