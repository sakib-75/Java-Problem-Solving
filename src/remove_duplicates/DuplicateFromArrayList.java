package remove_duplicates;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateFromArrayList {

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

        System.out.println("ArrayList with duplicates: " + list);

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: " + removeDuplicates(list));
    }

}
