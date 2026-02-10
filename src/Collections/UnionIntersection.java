package Collections;

import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Arrays.asList(1,2));
        Set<Integer> b = new HashSet<>(Arrays.asList(2,3));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);

        System.out.println(union);
        System.out.println(intersection);
    }
}
