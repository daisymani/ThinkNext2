package com.example.package1;

// In java a constructors cannot be overridden in the same way that methods are overridden.
// Constructors are not inherited by subclasses, so there's no concept of "Constructor Overriding"
// in java. However you can achieve similar behaviour by invoking constructors of the superclass
// within the constructors of the subclass using the 'super' keyword


//Suppose you have a superclass called Vehicle with a constructor that takes a parameter for the vehicle's name:
//Now, you want to create a subclass called Car that extends Vehicle and has its own constructor.
// In the subclass constructor, you can use the super keyword to call the constructor of the
// superclass:
//In this example, when you create an instance of Car, the Car constructor is called.
// Inside the Car constructor, the super(name) line invokes the constructor of the Vehicle
// superclass, initializing the name field. Then, the rest of the Car constructor executes.

 class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
        System.out.println("Vehicle constructor invoked with name: " + name);
    }
}
 class Car extends Vehicle {
    private String model;

    public Car(String name, String model) {
        super(name); // Call the constructor of the superclass
        this.model = model;
        System.out.println("Car constructor invoked with model: " + model);
    }
}
public class ConstructorOverridingExp1 {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
    }
}
