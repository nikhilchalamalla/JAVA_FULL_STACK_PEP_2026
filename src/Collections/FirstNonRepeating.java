package Collections;

import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','a','b'};
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char c : arr)
            map.put(c, map.getOrDefault(c,0)+1);
        for (char c : map.keySet())
            if (map.get(c)==1) {
                System.out.println(c);
                break;
            }
    }
}
