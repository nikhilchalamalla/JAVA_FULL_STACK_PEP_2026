package collection;

import java.util.*;

public class RemoveDuplicatesFromTwoLists {

    public static void main(String[] args) {

        // First list (with duplicates)
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 3, 2);

        // Second list (with duplicates)
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 6);

        // HashSet to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        // Add elements from both lists
        uniqueElements.addAll(list1);
        uniqueElements.addAll(list2);

        // Print unique elements
        System.out.println("Unique elements:");
        for (Integer value : uniqueElements) {
            System.out.println(value);
        }
    }
}
