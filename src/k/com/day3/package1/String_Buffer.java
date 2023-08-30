package k.com.day3.package1;

public class String_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Create a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Append text
        stringBuffer.append(", World!");

        // Print the result
        System.out.println(stringBuffer); // Output: Hello, World!
        
     // Insert text at a specific position
        stringBuffer.insert(5, " Java");
        
     // Print the result
        System.out.println(stringBuffer); 
        
     // Replace a portion of the text
        stringBuffer.replace(0, 5, "Hi");
        
     // Print the result
        System.out.println(stringBuffer); 
        
        
     // Delete a portion of the text
        stringBuffer.delete(2, 5);
        System.out.println(stringBuffer); 
        
     // Convert StringBuffer to a String
        String result = stringBuffer.toString();
        System.out.println(result); 
        
        
	}

}
