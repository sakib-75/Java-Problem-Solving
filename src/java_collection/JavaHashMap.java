package java_collection;

import java.util.HashMap;

public class JavaHashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("a", 10);
        map.put("b", 30);
        map.put("c", 20);
        map.put("s", 54);

        // Print size and content of the Map
        System.out.println("Size of map is: " + map.size());
        System.out.println(map);

        if (map.containsKey("s")) {
            Integer a = map.get("s");
            System.out.println("value for key is: " + a);
        }

    }

}
