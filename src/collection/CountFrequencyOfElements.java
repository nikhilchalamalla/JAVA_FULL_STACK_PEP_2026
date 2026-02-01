package collection;

import java.util.*;

public class CountFrequencyOfElements {

    public static void main(String[] args) {

        // Input list
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3);

        // HashMap to store frequency
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequency
        for (Integer num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print result
        for (Integer key : frequencyMap.keySet()) {
            System.out.println(key + " -> " + frequencyMap.get(key));
        }
    }
}
