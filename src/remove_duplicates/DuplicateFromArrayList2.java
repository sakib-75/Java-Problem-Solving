package remove_duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateFromArrayList2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

        System.out.println("ArrayList with duplicates: " + list);

        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());

        System.out.println("ArrayList with duplicates removed: " + newList);

    }

}
