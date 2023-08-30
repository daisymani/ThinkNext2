package k.com.day3.ScenariosPackage2;

//Interface definitions
interface A1 {
 void methodA1();
}

interface B1 {
 void methodB1();
}

interface C1 {
 void methodC1();
}

//Class implementing multiple interfaces
class MyClass implements A1, B1, C1 {
 @Override
 public void methodA1() {
     System.out.println("Method from interface A");
 }

 @Override
 public void methodB1() {
     System.out.println("Method from interface B");
 }

 @Override
 public void methodC1() {
     System.out.println("Method from interface C");
 }
}


public class Scenario2_MultipleInheritance_WithInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        MyClass myClass = new MyClass();

        // Calling methods from different interfaces
        myClass.methodA1();
        myClass.methodB1();
        myClass.methodC1();

	}

}
