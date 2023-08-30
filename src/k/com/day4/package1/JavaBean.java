package k.com.day4.package1;

import java.io.Serializable;


//JavaBeans are a convention for creating reusable components in Java by following a specific set of rules
// and patterns. JavaBeans typically consist of private fields, public getter and setter methods, and a
// no-argument constructor. This structure allows for encapsulation, property access, and easy integration
// into graphical development environments. Here's an example of a simple JavaBean:

//In this example, the Person class is designed as a JavaBean:
//
//Private Fields: The class has private fields to encapsulate the properties (name and age).
//Getters and Setters: Public getter and setter methods are provided for each property.
//   These methods allow external code to access and modify the values of the private fields.
//No-Argument Constructor: A no-argument constructor is provided. This is essential for JavaBeans,
//   as various frameworks (like GUI builders) rely on the ability to create an instance of the bean
//   using a no-argument constructor.

//Serializable: Implementing the Serializable interface allows the object to be easily serialized and deserialized.
//toString: An overridden toString method for providing a readable representation of the object.
//Here's an example of how you can use the Person JavaBean:

//In this example, you create a Person instance, set its properties using the setter methods, and then retrieve
//  and display the property values using the getter methods. The toString method also provides a convenient way to
//  display the object's content.
//
//Remember that JavaBeans can be used in various contexts, such as graphical user interface (GUI) development,
//  where components are created and configured using properties, or in any scenario where you want to encapsulate
//  data and provide controlled access to it.

class Person implements Serializable {
    private String name;
    private int age;

    public Person() {
        // No-argument constructor (required for JavaBeans)
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
public class JavaBean {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        System.out.println(person);
    }
}


//Use of Java Beans
//-----------------

//Use of serialization
//--------------------
//In the context of databases and computer science, "serializability" refers to a property that ensures that the
//  execution of concurrent transactions on a database produces the same results as if they were executed serially, one after the other, without any overlapping. In other words, it guarantees that the database remains in a consistent state even when multiple transactions are executed simultaneously.
//
//The significance of serializability lies in maintaining data integrity and consistency in a multi-user or
//  multi-threaded environment where multiple transactions can access and modify the same data concurrently.
//  Here are some key points that highlight the significance of serializability:
//
//Data Integrity: When multiple transactions are executed concurrently, there is a risk of data becoming inconsistent
//  due to interleaved operations. Serializability ensures that the final state of the database after executing all
//  transactions is equivalent to a serial execution of those transactions.

//Isolation: Serializability provides a high level of isolation between transactions. Each transaction appears to
//  execute in isolation, regardless of the presence of other concurrent transactions. This simplifies the programming
//  model for developers, as they can reason about the behavior of transactions without worrying about their concurrent
//  execution.

//Predictability: Serializability ensures that the outcome of concurrent transactions is predictable and consistent,
//  leading to fewer unexpected results and bugs in the application.
//Correctness: Many applications and systems rely on correct and consistent data to function properly. Serializability
//  helps maintain correctness by preventing scenarios where transactions interfere with each other and lead to
//  incorrect outcomes.
//Concurrency Control: Serializability is a key concept in concurrency control mechanisms. Databases use concurrency
// control techniques, such as locking and timestamp ordering, to ensure that transactions are executed in a
// serializable manner. These techniques manage the order of execution of transactions and help prevent conflicts.

//ACID Properties: Serializability is closely related to the ACID (Atomicity, Consistency, Isolation, Durability)
// properties of a database. ACID properties are crucial for maintaining the integrity of transactions and ensuring
// that the database remains in a reliable state, even in the face of failures.
//In summary, the significance of serializability lies in its ability to maintain data consistency,


//what is java bean
//-----------------
//JavaBeans is a software component architecture that provides a set of guidelines for creating reusable, modular,
//  and easily maintainable components in Java. It was introduced by Sun Microsystems (now part of Oracle) as a way to encapsulate and manage the state and behavior of objects in a standardized manner.
//
//The main characteristics of JavaBeans are:
//
//Properties: JavaBeans have properties, which are private instance variables (fields) that can be accessed through
//  public getter and setter methods. These methods follow a naming convention, where a property named "foo" would
//  have a getter method named "getFoo()" and a setter method named "setFoo()".

//Events: JavaBeans can generate and listen for events. They use the Java event model to allow components to
//   communicate and interact. This enables a decoupled way of handling interactions between different components.
//Persistence: JavaBeans can be serialized, meaning their state can be saved to a persistent storage medium (like a
// file or a database) and later restored. This is useful for scenarios where you want to save and load object states.
//Customization: JavaBeans can be customized at design time through visual tools (like IDEs) that understand the
//  JavaBeans conventions. This allows developers to create GUI components that can be easily manipulated and configured.
//Introspection: JavaBeans support introspection, which means that tools and frameworks can examine a bean's properties,
//  methods, and events at runtime. This introspective information can be used for various purposes, such as automatic
//  GUI generation or serialization.
//JavaBeans are used extensively in graphical user interface (GUI) programming, where they provide a way to create
//  reusable components that can be dragged and dropped onto GUI builders. They also find use in other areas of Java
//  development, such as enterprise applications and frameworks.
//
//To create a JavaBean, you typically follow the conventions mentioned above, which involve providing appropriate getter
//  and setter methods for your properties, following the event model for interaction, and ensuring that the bean can be
//  serialized properly.