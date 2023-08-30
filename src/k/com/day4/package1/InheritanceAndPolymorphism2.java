package k.com.day4.package1;

//Using Inheritance and Polymorphism Together:
//By combining inheritance and polymorphism, you can create a hierarchy of classes with shared behavior and
//   extend or modify that behavior in subclasses. This leads to more modular and maintainable code.

//In this example, we use an array of Animal references to demonstrate how shared behavior
//   (inherited makeSound method) can be utilized through polymorphism.
//
//By leveraging inheritance and polymorphism, you create a more organized, extensible, and adaptable codebase
//    that can handle variations in behavior while maintaining commonality.

class Animal1 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat1 extends Animal1 {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class InheritanceAndPolymorphism2 {

    public static void main(String[] args) {
        Animal1[] animals1 = { new Dog1(), new Cat1() };

        for (Animal1 animal1 : animals1) {
            animal1.makeSound(); // Polymorphic method call
        }
    }
}
