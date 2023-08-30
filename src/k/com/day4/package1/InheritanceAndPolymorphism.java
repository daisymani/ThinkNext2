package k.com.day4.package1;


//Inheritance and polymorphism are core concepts in object-oriented programming that allow you to share commonality and
//  promote code reuse. Let's explore how these concepts work together to achieve this goal.
//
//Inheritance:
//Inheritance allows you to create a new class (subclass or derived class) that inherits attributes and methods
//   from an existing class (superclass or base class). This facilitates the reuse of code and enables the creation
//   of specialized classes that share common behavior.

//In this example, both Dog and Cat classes inherit the makeSound method from the Animal class. This promotes code
//   reuse and enables us to extend the behavior of the base class while maintaining commonality.
//
//Polymorphism:
//Polymorphism allows objects of different classes to be treated as objects of a common superclass. This enables
// dynamic method invocation and promotes flexibility and extensibility in code.

//In this example, we create an array of Animal references that can point to instances of Dog and Cat classes.
//  Through polymorphism, we can call the makeSound method on each object without knowing the specific class.
//  This flexibility is achieved through method overriding.

//Polymorphic method call

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class InheritanceAndPolymorphism {

    //Polymorphic example
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        Animal[] animals = { dog, cat };

        for (Animal animal : animals) {
            animal.makeSound(); // Polymorphic method call
        }
    }
}
