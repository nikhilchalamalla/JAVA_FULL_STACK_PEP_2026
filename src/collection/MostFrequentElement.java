package collection;

import java.util.*;

public class MostFrequentElement {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,2,3,3,3,4);

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (Integer n : list) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        int maxCount = 0;
        int result = -1;

        for (Integer key : freq.keySet()) {
            if (freq.get(key) > maxCount) {
                maxCount = freq.get(key);
                result = key;
            }
        }

        System.out.println("Most frequent element: " + result);
    }

}
