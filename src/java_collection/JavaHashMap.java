package java_collection;

import java.util.HashMap;
import java.util.Map;

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

        // Using keySet() to get the set view of keys
        System.out.println("The key set is: " + map.keySet());

        // Using values() to get the set view of values
        System.out.println("The collection is: " + map.values());

        // Getting the value
        System.out.println("The Value is: " + map.get("c"));

        // Checking for the key_element
        System.out.println("Is the key 's' present? " + map.containsKey("s"));

        // Checking for the value
        System.out.println("Is the value '340' present? " + map.containsValue(340));

        // Iterate the map using for-each loop
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }

    }

}
