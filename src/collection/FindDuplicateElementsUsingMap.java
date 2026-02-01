package collection;

import java.util.*;

public class FindDuplicateElementsUsingMap {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4);

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequency
        for (Integer num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print duplicates
        System.out.println("Duplicate elements:");
        for (Integer key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > 1) {
                System.out.println(key);
            }
        }
    }
}
