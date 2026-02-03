package collection;
import java.util.*;
public class IntersectionOfLists {
    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1,2,3,4);
        List<Integer> l2 = Arrays.asList(2,3,5);
        List<Integer> l3 = Arrays.asList(3,2,6);

        Set<Integer> result = new HashSet<>(l1);
        result.retainAll(l2);
        result.retainAll(l3);

        System.out.println(result);
    }
}
