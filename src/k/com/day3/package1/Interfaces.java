package k.com.day3.package1;

//##############################################################################################################################################//
//# Interfaces are used for multiple inheritance
//One of the key purposes of interfaces in Java is to achieve a form of multiple inheritance. Java supports single inheritance for classes 
//(a class can extend only one superclass), but it allows a class to implement multiple interfaces.

//This enables a class to inherit behavior from multiple sources, which is a type of multiple inheritance.
//In Java, interfaces provide a way to define a contract that classes must adhere to by implementing the methods declared in the interface. 
//Here's how interfaces enable multiple inheritance:
//##############################################################################################################################################//


//# There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance 
//in Java. In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.


interface A {
    void methodA();
 
//    public void methodC() {
//        System.out.println("Method A");
//    }
}

interface B {
    void methodB();
}

class MyClass implements A, B {
    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B");
    }
}


public class Interfaces {
	
	public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA(); // Output: Method A
        obj.methodB(); // Output: Method B
    }

}


//Interfaces A and B each declare a single method.
//The MyClass class implements both interfaces A and B, providing implementations for both methodA() and methodB()
//Through this implementation, MyClass effectively inherits behavior from both interfaces, achieving a form of multiple inheritance.
//It's important to note that interfaces are more than just a way to achieve multiple inheritance. They also promote code reusability, 
//abstraction, and provide a contract that ensures classes adhere to a specific interface. This enables you to write flexible and maintainable code in Java.