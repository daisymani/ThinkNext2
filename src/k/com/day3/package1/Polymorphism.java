package k.com.day3.package1;

//#############################################################################################################################
//We define an Shape interface with two methods: calculateArea() and display()
//The Circle and Rectangle classes implement the Shape interface and provide their own implementations for the methods.
//In the main method, we create instances of Circle and Rectangle but store them in Shape references.
//The displayShapeDetails() method accepts an object of type Shape (which can be an instance of Circle or Rectangle) 
   //and calls the methods from the interface.
//This demonstrates polymorphism: different classes implementing the same interface can be treated interchangeably 
//through the interface reference, allowing for code reusability and flexibility.
//#############################################################################################################################


//Polymorphism allows objects of different classes to be treated as object of a common superclass or interface
//Polymorphism is achieved through method overriding and interface implementations

//Define an interface
interface Shape {
 double calculateArea();
 void display();
}

//Implementing classes
class Circle implements Shape {
 double radius;

 Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }

 @Override
 public void display() {
     System.out.println("Circle with radius " + radius);
 }
}

class Rectangle implements Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void display() {
        System.out.println("Rectangle with width " + width + " and height " + height);
    }
}


public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        displayShapeDetails(circle);
        displayShapeDetails(rectangle);
	}

	// A method that works with the Shape interface
    static void displayShapeDetails(Shape shape) {
        shape.display();
        System.out.println("Area: " + shape.calculateArea());
    }
}
