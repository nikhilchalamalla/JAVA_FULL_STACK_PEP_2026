package collection;

import java.util.*;

public class FindDuplicateElementsUsingSet {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer num : list) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        // Print duplicates
        System.out.println("Duplicate elements:");
        for (Integer num : duplicates) {
            System.out.println(num);
        }
    }

}
