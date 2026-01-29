package collection;

import java.util.*;

public class RemoveAdjacentDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 5, 5, 6, 6, 6, 7, 7, 7};

        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[0]);

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }

        for(int num : list) {
            System.out.print(num + " ");
        }
    }
}
