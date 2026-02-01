package collection;

import java.util.*;

public class ElementsInMapNotInList {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "Spring");

        List<String> list = Arrays.asList("Java", "AWS");

        Set<String> result = new HashSet<>(map.values());
        result.removeAll(list);

        System.out.println("Elements in Map but not in List:");
        for (String s : result) {
            System.out.println(s);
        }
    }

}
