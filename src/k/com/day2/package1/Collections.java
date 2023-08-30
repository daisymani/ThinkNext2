package k.com.day2.package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;

public class Collections {

	public static void main(String[] args) {
		
		JavaArrayList();
		//JavaHashMap();
		//JavaHashSet();
		//JavaLinkedList();
		//JavaTreeMap();
		

	}

	public static void JavaArrayList() {
		ArrayList<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");


        System.out.println("JavaArrayList ####");
        
        System.out.println(names);  // Output: [Alice, Bob, Charlie]
        System.out.println(names.get(1));  // Output: Bob

       // System.out.println(names.sort(););
        //names.stream().sorted();
        System.out.println(names);
	}
	
	
	//HashMap
	//HashMap is basically an implementation of hashing. So wherever we need hashing with key value pairs, 
	//we can use HashMap. For example, in Web Applications username is stored as a key and user data is 
	//stored as a value in the HashMap, for faster retrieval of user data corresponding to a username.  
	
	public static void JavaHashMap() {
		HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");

        System.out.println("JavaHashMap ####"); 
        System.out.println("            ");
        
        System.out.println(students);  // Output: {1=Alice, 2=Bob, 3=Charlie}
        System.out.println(students.get(2));  // Output: Bob
	}
	
	//HashSet
	public static void JavaHashSet() {
		HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice");  // Duplicate, won't be added
        
        System.out.println("JavaHashSet ####"); 
        System.out.println("            ");

        System.out.println(uniqueNames);  // Output: [Alice, Bob]
       
	}
	
	//LinkedList
	public static void JavaLinkedList() {
		LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("JavaLinkedList ####"); 
        System.out.println("            ");
        
        System.out.println(colors);  // Output: [Red, Green, Blue]
        System.out.println(colors.getFirst());  // Output: Red
        
        System.out.println(colors.get(2));  // Output: Green
        System.out.println(colors.getLast());  // Output: Blue
        
       // System.out.println(colors.);  // Output: Blue
        
	}
	
	//JavaTreeMap
	//TreeMapTreeMap can be a bit handy when we only need to store unique elements in a sorted order. Java.util.TreeMap 
	//uses a red-black tree in the background which makes sure that there are no duplicates; additionally it also maintains
	//the elements in a sorted order.
	
	public static void JavaTreeMap() {
		TreeMap<String, Integer> wordCounts = new TreeMap<>();
        wordCounts.put("apple", 5);
        wordCounts.put("banana", 5);
        wordCounts.put("cherry", 7);
        wordCounts.put("cherry", 4);
        
        System.out.println("JavaTreeMap ####");
        System.out.println("            ");

        System.out.println(wordCounts);  // Output: {apple=5, banana=2, cherry=7}
        System.out.println(wordCounts.get("banana"));  // Output: 2
	}
	
	
}
