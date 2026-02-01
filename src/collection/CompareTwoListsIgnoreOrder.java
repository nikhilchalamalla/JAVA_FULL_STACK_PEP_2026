package collection;

import java.util.*;

public class CompareTwoListsIgnoreOrder {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,3,4);
        List<Integer> list2 = Arrays.asList(4,3,2,1);

        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        System.out.println(set1.equals(set2));
    }

}
