/*

Inheritance is when properties and methods of baase class are passed 
on to a derived class.
-- main purpose of inheritance is to increase code reusability
types of inheritance
1.single level inheritance 
2.multilevel inheritance
3.Hierarchial inheritance 
4.hybrid inheritance 
5.multiple inheritance( not support by java) but 

*/

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // inherited from Animal
        d.bark(); // own method
    }
}
