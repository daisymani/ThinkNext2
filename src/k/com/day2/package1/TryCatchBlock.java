package k.com.day2.package1;

//###################################################################################################
// Class to explain TryCatchBlock
//    Various Exceptions
//	  1. NullPointerException
//	  2. ArrayIndexOutOfBoundsException
//	  3. ArithmeticException
//    4. IllegalArgumentException
//	  5. NumberFormatException
//    6. ClassCastException
//    7. FileNotFoundException
//    8. IOException
//    9. InterruptedException
//    10. NoSuchElementException
//    11. OutOfMemoryError
//    12. StackOverflowError
//	  13. SecurityException
//    14. SQLException
//	  15. UnsupportedOperationException
//    16. UncheckedIOException
//####################################################################################################

public class TryCatchBlock {

	public static void main(String[] args) {
		
	   ArithmeticException();
		GenericException();
		
		
    }
	
	public static void ArithmeticException() {
		try {
           
			validateResult();
           
          //  int result = numerator / denominator;  // This will throw an ArithmeticException
		//	System.out.println("Result: " + result);  // This line won't be executed
        } catch (ArithmeticException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
        System.out.println("Program continues...");
        
        
	}
	
	public static void validateResult() {
		 int numerator = 10;
         int denominator = 0;
    	int result = numerator / denominator;  
    
      
            throw new ArithmeticException("Age cannot be negative");
      
    }

	
	public static void GenericException() {
		try {
            int[] numbers = {1, 2, 3};
            int result = numbers[5];  // This will throw an ArrayIndexOutOfBoundsException
            System.out.println("Result: " + result);  // This line won't be executed
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
            
           // System.out.println("stackrace: " + e.);
            
            
//            if (arithe= Arith) {
//            	
//            	code
//            	
//            }if else (){
//            	code
//            }
        }
        
        System.out.println("Program continues...");
	}
}


//*NullPointerException: Occurs when you try to access a method or field on an object that is currently null.
//*ArrayIndexOutOfBoundsException: Thrown when you attempt to access an array element at an invalid index 
	//(index that is negative or greater than or equal to the array length).
//*ArithmeticException: Raised when an arithmetic operation (like division) is performed with inappropriate 
    //arguments, such as division by zero.
//*IllegalArgumentException: This exception is thrown when an illegal or inappropriate argument is passed to 
    //a method.
//*NumberFormatException: Occurs when you try to convert a string to a numeric type (like int or double), 
    //but the string's format is not valid for the conversion.
//*ClassCastException: Thrown when an attempt is made to cast an object to a subclass of which it is not an
    //instance.
//*FileNotFoundException: Raised when an attempt is made to access a file that does not exist on the filesystem.
//*IOException: A generic exception that represents problems with input or output operations, such as reading or
   //writing files.
//*InterruptedException: Typically raised when a thread is waiting, sleeping, or otherwise occupied, and another
   //thread interrupts it.
//*NoSuchElementException: Occurs when trying to access an element that is not present in a collection or container,
   //like when calling next() on an empty Iterator.
//*OutOfMemoryError: Thrown when the Java Virtual Machine (JVM) runs out of memory, usually due to excessive memory
   //allocation or resource leaks.
//*StackOverflowError: Occurs when the call stack of a program exceeds its limit, typically due to excessive recursion.
//*SecurityException: Raised when a security violation occurs, such as attempting to perform an operation that is not
   //permitted by the security manager.
//*SQLException: Represents an error that occurred while accessing or manipulating a database using JDBC.
//*SQLException: Represents an error that occurred while accessing or manipulating a database using JDBC.
//*UncheckedIOException: A subclass of IOException that is unchecked, meaning it doesn't need to be explicitly 
	//caught or declared.

