package Collections;

import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        Map<Integer,Integer> m1=new HashMap<>();
        m1.put(1,10); m1.put(2,20);
        Map<Integer,Integer> m2=new HashMap<>();
        m2.put(2,30); m2.put(3,40);

        for (int k:m2.keySet())
            m1.put(k, m1.getOrDefault(k,0)+m2.get(k));
        System.out.println(m1);
    }
}
