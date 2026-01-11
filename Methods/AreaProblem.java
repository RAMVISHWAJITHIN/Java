public class AreaProblem {

    public static double circle() {
        double r = 5;
        double result = 3.14 * r * r;
        return result;

    }

    public static double Rectangle() {
        double l = 5;
        double b = 10;
        double result = l * b;
        return result;

    }

    public static int maxOfTwoNumber() {
        int a = 5;
        int b = 10;
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args) {
        System.out.println("Main Method starts");
        System.out.println("the Area of Circle :" + circle());
        System.out.println("the Area of Rectangle :" + Rectangle());
        System.out.println("the Max of two numbers :" + maxOfTwoNumber());

    }
}
