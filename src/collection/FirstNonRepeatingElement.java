package collection;

import java.util.*;

public class FirstNonRepeatingElement {

    public static void main(String[] args) {

        List<Character> list =
                Arrays.asList('a','b','c','a','b','d');

        HashMap<Character, Integer> freq = new HashMap<>();

        for (Character ch : list) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : list) {
            if (freq.get(ch) == 1) {
                System.out.println("First non-repeating: " + ch);
                break;
            }
        }
    }
}
