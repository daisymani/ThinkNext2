package com.example.package1;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare and initialize an array of integers
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Access and print elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
       // String ArrayStr = split Str("a:b:c:")

        // Calculate the sum of the array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of array elements: " + sum);

        // Find the maximum element in the array
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);
    }
	}

	
	


//In this example:
//
//An array of integers named numbers is declared and initialized with values.
//The program iterates through the array using a for loop and prints the elements at each index.
//The sum of the array elements is calculated using an enhanced for-each loop.
//The maximum element in the array is found using a for loop and comparison.
//When you run this program, you'll see the output that shows the elements of the array, the sum of the elements, and the maximum element.
//
//Remember that arrays in Java are zero-based, meaning the first element is at index 0, the second element at index 1, and so on.




