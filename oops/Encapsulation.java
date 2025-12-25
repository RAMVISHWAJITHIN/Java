/*

Encapsulation: it is defined as the wrapping up of data and methods under a single units.
it also implements data hiding.

for example:
Think of an ATM:
-- you don't directly access (or) change the balance of your account from outside.
-- you must use methods like deposit (or) withdraw.t his ensures safety and prevents invalid actions (like negative balances) */

public class Encapsulation {

    // private variables (data hiding)
    private String name;
    private int age;

    // public setter methods
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    // public getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // main method
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        obj.setName("Ram");
        obj.setAge(22);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
