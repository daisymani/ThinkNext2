package com.example.package1;

public class JavaDataType {

	public static void main(String[] args) {
//		byte: 8-bit signed integer.
//		short: 16-bit signed integer.
//		int: 32-bit signed integer.
//		long: 64-bit signed integer.
//		float: 32-bit floating-point number.
//		double: 64-bit floating-point number.
//		char: 16-bit Unicode character.
//		boolean: Represents true or false values.
		
		  // Primitive data types
        byte myByte = 126;
        
        String varStr = "string value";
        
        short myShort = 32000;
        
        int myInt = 100000;

        long myLong = 1234567890123L; // Use 'L' for long literals
        float myFloat = 3.14f; // Use 'f' for float literals
        double myDouble = 2.71828;
        char myChar = 'A';
        boolean myBoolean = true;
        
        
        System.out.println(myByte);
        
        
        
        System.out.println("print");

        System.out.println("Byte: " + myByte);
        System.out.println("Byte Range : -128 to 127   & precision = Exact" );
        
        System.out.println("Short: " + myShort);
        System.out.println("Short Range : -32,768 to 32,767 & Precision = Exact");
        
        System.out.println("Int: " + myInt);
        System.out.println("int Range :  -2^31 to 2^31 - 1 & Precision = Exact");
        
        
        System.out.println("Long: " + myLong);
        System.out.println("Long Range : -2^63 to 2^63 - 1 & Precision = Exact");
        
        
//        long minValue = -9223372036854775808L; // -2^63
//        long maxValue = 9223372036854775807L;  // 2^63 - 1
//
//        System.out.println("Minimum long value: " + minValue); // Output: Minimum long value: -9223372036854775808
//        System.out.println("Maximum long value: " + maxValue); // Output: Maximum long value: 9223372036854775807
//    
        System.out.println("Float: " + myFloat);
        System.out.println("32-bit floating-point number (IEEE 754) : "
        		+ "float Range : Approximately ±1.4 x 10^-45 to ±3.4 x 10^38"
        		+ " & Precision = About 7 decimal places");
        
        //This is the smallest positive (and negative) value that a float can represent.
        //It's approximately 1.4 times 10 raised to the power of -45. 
        //In scientific notation, this is a very small positive number.
        
        System.out.println("Double: " + myDouble);
        
        System.out.println("Double: Approximately ±4.9 x 10^-324 to ±1.7 x 10^308"
        		+ "Precision: About 15 decimal places");
        
        
        System.out.println("Char: " + myChar);
        System.out.println("Char Range: '\\u0000' to '\\uffff' (0 to 65,535)"
        		+"Precision = Exact");
        
        
        System.out.println("Boolean: " + myBoolean);
        System.out.println("Boolean Range = true or false & precision :N/A");
        
        //primitive data types ranges and summary
        

        System.out.println(varStr);
		
		

	}

}
