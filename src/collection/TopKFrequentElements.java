package collection;
import java.util.*;
public class TopKFrequentElements {
    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int n : nums)
            freq.put(n, freq.getOrDefault(n, 0) + 1);

        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a,b) -> freq.get(b) - freq.get(a));

        pq.addAll(freq.keySet());

        for (int i = 0; i < k; i++)
            System.out.println(pq.poll());
    }
}

