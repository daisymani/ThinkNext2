package k.com.day4.package1;
import java.util.Arrays;
import java.util.Collections;

public class SortingArrays {
    public static void main(String[] args) {
        //sortArray();
        SortArray2();
    }
    public static void sortArray(){
        int[] arr = { 5, 2, 8, 1, 3 };

        // Sorting the array in ascending order
        Arrays.sort(arr);

        System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));

    }

    public static void SortArray2(){
        Integer[] arr = { 5, 2, 8, 1, 3 }; // Note: Integer instead of int

        // Sorting the array in ascending order
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Sorted array in descending order: " + Arrays.toString(arr));

    }
}
