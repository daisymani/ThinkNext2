package k.com.day3.ScenariosPackage2;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperator {

	public static void main(String[] args) {
        // Using the diamond operator with ArrayList
        List< String > stringList = new ArrayList<String>();

        stringList.add("Hello");
        stringList.add("World");

        // Loop through and print the elements
        for (String str : stringList) {
            System.out.println(str);
        }
    }

}
