package main.java.algorithms.arrays;

import java.util.HashMap;
import java.util.Map;

public class NoOfSubarraysHavingSumK {



    public void findSubarray(int[] arr, int k) {
        int csum = 0;
        int pre = 0;

        int res =0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++) {

            csum+=arr[i];

            pre = csum-k;

            if (map.containsKey(pre)) {
                res+=map.get(pre);
            }

            map.put(csum, map.getOrDefault(csum, 0)+1);
        }
        

    }

    public static void main(String... args) {

    }
}
