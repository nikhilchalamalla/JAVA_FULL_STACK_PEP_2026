package collection;
import java.util.*;
public class RemoveDuplicatesFromMapAndList {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "Spring");
        map.put(4, "Java");

        List<String> list = Arrays.asList(
                "React", "Java", "Python", "React", "AWS"
        );

        Set<String> resultSet = new HashSet<>();

        for(String value : map.values()) {
            resultSet.add(value);
        }

        for(String value : list) {
            resultSet.add(value);
        }

        System.out.println("Unique values: ");
        for (String value: resultSet) {
            System.out.println(value);
        }
    }
}

