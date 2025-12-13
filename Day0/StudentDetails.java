
// public package Day0;
import java.util.*;

class StudentDetails {

    public static void main(String[] args) {
        // String name = "rvj";
        // int age = 23;
        // char gender = 'm';
        // String degree = "Btech";
        // String stream = "cse";
        // int yop = 2025;
        // double cgpa = 9.01;
        // boolean passResult = true;
        // System.out.println("name is :" + name);
        // System.out.println("age :" + age);
        // System.out.println("degree :" + degree);
        // System.out.println("stream :" + stream);
        // System.out.println("yop :" + yop);
        // System.out.println("cgpa :" + cgpa);
        // System.out.println("passResult :" + passResult);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("enter gender");
        char gender = sc.next().charAt(0);
        System.out.println("enter degree");
        String degree = sc.next();
        System.out.println("enter stream");
        String stream = sc.next();
        System.out.println("enter yop");
        int yop = sc.nextInt();
        System.out.println("enter cgpa");
        double cgpa = sc.nextDouble();
        System.out.println("enter pass result");
        boolean passResult = sc.nextBoolean();

        System.out.println("name is :" + name);
        System.out.println("age :" + age);
        System.out.println("gender is:" + gender);
        System.out.println("degree :" + degree);
        System.out.println("stream :" + stream);
        System.out.println("yop :" + yop);
        System.out.println("cgpa :" + cgpa);
        System.out.println("passResult :" + passResult);

    }
}