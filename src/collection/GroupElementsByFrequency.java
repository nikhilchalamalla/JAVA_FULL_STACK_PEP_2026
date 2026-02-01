package collection;

import java.util.*;

public class GroupElementsByFrequency {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,1,2,2,2,3);

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (Integer num : list) {
            map.computeIfAbsent(num, k -> new ArrayList<>()).add(num);
        }

        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }

}
