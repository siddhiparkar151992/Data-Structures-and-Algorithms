package main.java.algorithms.arrays;

/**
 * Created by Siddhi Parkar on 04-01-2018.
 */
public class MaximumLengthBotanicSubArr {

    public static void find(int[] arr) {
        int maxLegth = 0;
        int start = 0;
        int i = 0;
        while (i < arr.length) {
            if(i+1 < arr.length ){
                if(arr[i+1] < arr[i]){
                    maxLegth = Math.max(i+1-start+1, maxLegth);
                    start = i+1;
                }
            }else {
                maxLegth = Math.max(i+1-start+1, maxLegth);
                break;
            }
            i++;
        }
        System.out.println(maxLegth);
    }

    public static void main(String[] args) {
        find(new int[]{12, 4, 32, 40, 45, 59});
    }
}
