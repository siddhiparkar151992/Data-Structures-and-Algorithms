package main.java.algorithms.arrays;

/**
 * Created by Siddhi Parkar on 06-01-2018.
 */
public class MaxProductSubarray {
    public static void findMax(int[] arr){
        int pr = 1;
        int maxPr = 0;
        for(int i=0;i<arr.length;i++){
            maxPr = Math.max(pr, maxPr);
            pr = arr[i]*pr;
        }
        System.out.println(maxPr);
    }
    public static void main(String[] args){
        findMax(new int[] {-1, -3, -10, 0, 60});
    }
}
