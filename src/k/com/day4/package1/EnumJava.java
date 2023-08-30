package k.com.day4.package1;


//An enum, short for "enumeration," is a data type in programming languages that allows you to define
//   a set of named constant values. These values represent a finite list of possible states or options
//   for a particular variable or property. Enums are often used to improve code readability, maintainability,
//   and to prevent errors that might arise from using arbitrary integer values or strings to represent different options.

//In this Java program, we define an enum CoffeeType with four different coffee options. The getCoffeeDescription
//   method takes a CoffeeType enum value and returns a description of the corresponding coffee type. The main
//   method demonstrates how to use the enum by assigning a value to myCoffee and then printing its description.
//
//To run the program, save it to a file named CoffeeShop.java and compile and execute it using a Java compiler and
// runtime environment.

//All Enums are type safe
public class EnumJava {
    //if this is a class of coffee shop
    // Define the enum
    enum CoffeeType {
        ESPRESSO,
        AMERICANO,
        LATTE,
        CAPPUCCINO,
        latte
    }

    // Method to get the coffee description based on the enum value
    static String getCoffeeDescription(CoffeeType coffeeType) {
        switch (coffeeType) {
            case ESPRESSO:
                return "Strong and concentrated coffee";
            case AMERICANO:
                return "Diluted espresso with hot water";
            case LATTE:
                return "Espresso with a lot of steamed milk";
            case CAPPUCCINO:
                return "Espresso with equal parts of steamed milk and milk foam";
            default:
                return "Unknown coffee type";
        }
    }
    
    public static void main(String[] args) {
        CoffeeType myCoffee = CoffeeType.latte;
        System.out.println("I ordered a " + myCoffee + ".");
        System.out.println("Description: " + getCoffeeDescription(myCoffee));
    }
}
