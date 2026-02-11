package Collections;

import java.util.*;

public class MostFrequent {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,3};
        Map<Integer,Integer> map = new HashMap<>();
        for (int n:arr) map.put(n,map.getOrDefault(n,0)+1);

        int maxKey=0,max=0;
        for (int k:map.keySet())
            if (map.get(k)>max){max=map.get(k);maxKey=k;}
        System.out.println(maxKey);
    }
}
