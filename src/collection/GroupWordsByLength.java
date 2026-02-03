package collection;
import java.util.*;
public class GroupWordsByLength {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("cat","dog","apple","bat");

        HashMap<Integer, List<String>> map = new HashMap<>();

        for (String word : words) {
            map.computeIfAbsent(word.length(), k -> new ArrayList<>()).add(word);
        }

        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
