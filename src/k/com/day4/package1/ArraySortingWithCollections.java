package k.com.day4.package1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySortingWithCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(3);

        // Sorting the list in ascending order
        Collections.sort(list);

        System.out.println("Sorted list in ascending order: " + list);
        
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted list in descending order: " + list);
        //SortCollection2();
    }

//    public static void SortCollection2(){
//        List<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(2);
//        list.add(8);
//        list.add(1);
//        list.add(3);
//
//        // Sorting the list in ascending order
//        Collections.sort(list, Collections.reverseOrder());
//
//        System.out.println("Sorted list in descending order: " + list);
//    }
  //  }
}