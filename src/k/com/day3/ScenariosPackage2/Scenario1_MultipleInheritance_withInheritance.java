package k.com.day3.ScenariosPackage2;

//Write a program to inherit methods from 3 different classes using Inheritance and other concepts but not interfaces


class A {
    void methodA() {
        System.out.println("Method from class A");
    }
}

class B {
    void methodB() {
        System.out.println("Method from class B");
    }
}

class C {
    void methodC() {
        System.out.println("Method from class C");
    }
}

//Subclass inheriting from classes A, B, and C
class Subclass extends A {
 B objB = new B();
 C objC = new C();

 void callMethods() {
     methodA(); // Inherited from class A
     objB.methodB(); // Method from class B
     objC.methodC(); // Method from class C
 }
}

public class Scenario1_MultipleInheritance_withInheritance {
	
    public static void main(String[] args) {
        Subclass sub = new Subclass();
        sub.callMethods();
    }

}
