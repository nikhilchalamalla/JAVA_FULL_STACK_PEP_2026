package collection;

import java.util.*;

public class CommonElementsFromMapAndList {

    public static void main(String[] args) {

        // HashMap with values
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "Spring");

        // List
        List<String> list = Arrays.asList("Java", "AWS", "Python");

        // Step 1: Store map values in a HashSet
        Set<String> mapValuesSet = new HashSet<>(map.values());

        // Step 2: Set to avoid duplicate printing
        Set<String> commonElements = new HashSet<>();

        // Step 3: Find common elements
        for (String value : list) {
            if (mapValuesSet.contains(value)) {
                commonElements.add(value);
            }
        }

        // Step 4: Print common elements
        System.out.println("Common elements:");
        for (String value : commonElements) {
            System.out.println(value);
        }
    }

}
