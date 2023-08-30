package k.com.day4.package1;

//In this example, the Car class is composed of an Engine object and an array of Wheel objects, representing
//  the composition relationship between a car and its components. The Car class encapsulates the functionalities
//  related to a car, and it doesn't manage the detailed behaviors of the engine and wheels directly.
//
//Composition allows you to build more complex structures by combining simpler components while promoting modularity,
//   encapsulation, and reusability. The Car class doesn't need to know the internal details of the Engine and Wheel
//   classes; it only needs to interact with their defined interfaces.

// Engine class representing a car's engine
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Wheel class representing a car's wheel
class Wheel {
    private int size;

    public Wheel(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

// Car class representing a car composed of an engine and wheels
class Car {
    private String model;
    private Engine engine; // Composition: Car has an Engine
    private Wheel[] wheels; // Composition: Car has Wheels

    public Car(String model, Engine engine, Wheel[] wheels) {
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }
}

public class CompositionDemo2 {
    public static void main(String[] args) {
        // Create an Engine
        Engine v6Engine = new Engine("V6");

        // Create an array of Wheels
        Wheel[] carWheels = { new Wheel(17), new Wheel(17), new Wheel(17), new Wheel(17) };

        // Create a Car with the Engine and Wheels
        Car myCar = new Car("Sedan", v6Engine, carWheels);

        // Display car information
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Engine Type: " + myCar.getEngine().getType());
        System.out.println("Wheel Sizes: ");
        for (Wheel wheel : myCar.getWheels()) {
            System.out.println(wheel.getSize());
        }
    }
}
