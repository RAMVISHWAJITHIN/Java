/*

Abstraction:hiding all the unnecessary details, an showing 
only the important parts of the user.
--- abstraction can be implemented in 2 ways:
   1.abstract keyword
   2.interfaces

-- an abstract class is a class that cannot be used to create objects directly 
and is meant to be inherited by other classes.
-- can have abstract/non abstarct methods
--can have constructors but not object creation.
*/

abstract class Animal {

    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class
class Dog extends Animal {

    // Implementing abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.sound();
        a.sleep();
    }
}
