
/*
polymorphism in java means "many forms". it allows one method to take many forms and provides 
flexibility in how methods behave depending on the object that calls them

1.complie time polymorphism: also known as static polymorphism (or) early binding is the type of polymorphism
where binding of the call to its code , is done at the complie time.


2.Run time polymorphism(dynamic): also known as dynamic polymorphism (or) late binding.
runtime polymorphism is the type of polymorphism where the actual implementation
of the function is determined during the runtime (or) execution
*/

class Calculator {

    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // Method Overloading
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20, 30));
        System.out.println(calc.add(5.5, 4.5));

        // Method Overriding
        Animal a = new Dog(); // Runtime Polymorphism
        a.sound();
    }
}
