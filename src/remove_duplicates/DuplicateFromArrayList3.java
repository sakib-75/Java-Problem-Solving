package remove_duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateFromArrayList3 {

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list)
    {
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(list);

        list.clear();
        list.addAll(set);

        return list;
    }

    // Driver code
    public static void main(String[] args)
    {

        // Get the ArrayList with duplicate values
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: " + list);

        // Remove duplicates
        ArrayList<Integer> newList = removeDuplicates(list);

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: " + newList);
    }

}
