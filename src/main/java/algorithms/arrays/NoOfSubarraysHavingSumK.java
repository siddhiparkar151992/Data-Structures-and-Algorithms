package main.java.algorithms.arrays;

public class NoOfSubarraysHavingSumK {

    public int findSubarraysUtil(int[] arr, int i, int j,int k, int csum) {
        if (k == csum) {
            return 1;
        }
        if (i >= arr.length) {
            return 0;
        }
        int sum=0;
        for (int h = i + 1; j < arr.length; j++) {
            sum+=
        }
        return findSubarraysUtil(arr, i+1, arr.length, k, csum);
    }

    public void findSubarray(int[] arr, int k) {


    }

    public static void main(String... args) {

    }
}
