package collection;

import java.util.*;

public class MergeTwoHashMaps {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 10);
        map1.put(2, 20);

        HashMap<Integer, Integer> map2 = new HashMap<>();
        map2.put(2, 30);
        map2.put(3, 40);

        for (Integer key : map2.keySet()) {
            map1.put(key, map1.getOrDefault(key, 0) + map2.get(key));
        }

        System.out.println(map1);
    }

}
