package main.java.amazon;

import java.util.Arrays;

/**
 * Created by Siddhi Parkar on 26-11-2017.
 */
public class MinimumNumberOfPlatoformsNeeded {

    public static void findMinPlatforms(int[] arr, int[] dept){
        Arrays.sort(dept);
        int i=0;
        int j =0;
        int maxCount = 0;
        int count =0;
        while(i<arr.length && j< dept.length){
            maxCount = Math.max(maxCount, count);
            if(arr[i]< dept[j]) {
                count ++;
                i++;
            }else {
                count--;
                j++;
            }

        }
        System.out.println(maxCount);
    }
    public static void main(String[] args ) {
        findMinPlatforms(new int[]{900, 940, 950, 1100, 1500, 1800}, new int[]{910, 1200, 1120, 1130, 1900, 2000});
    }
}
