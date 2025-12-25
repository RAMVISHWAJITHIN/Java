/* 
oops is a programming style where 
software is made up "objects" and interact with each other.
each object holds data  and methods to work with that.

the four pillars of oops
1.Encapsulation
2.inheritance
3.polymorphism
4,abstraction


class: the class represents a group of objects having similar properties 
and behaviour ,or
 in other words,we can say that a class is a blueprint for objects,while an 
 object is an instance of a class.
 Note:classes don't use memory,they serve as template.

 for example ,the animal type dog is a class while particular dog name tommy is 
 an object of the dog class

*/
public class class_oops {

    static class Pen {
        String color;
        int tip;

        void setColor(String newColor) {
            color = newColor;
        }

        void setTip(int newTip) {
            tip = newTip;
        }

    }

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}
