package remove_duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateFromArrayList3 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

        Set<Integer> set = new LinkedHashSet<>(list);

        list.clear();
        list.addAll(set);

        System.out.println("ArrayList with duplicates: " + list);
        System.out.println("ArrayList with duplicates removed: " + list);

    }

}
