package main.java.algorithms.arrays;

public class EquilibriamOfArray {

    public static int equilibriam(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int lsum = 0;
        int li = 0;
        for (int i = 0; i < arr.length; i++) {

            sum-=arr[i];
            if (sum== lsum) {
                return i;
            }
            lsum+=arr[i];
        }
        return -1;

    }

    public static void main(String... args) {
        equilibriam(new int[]{-7, 1, 5, 2, -4, 3, 0} );
    }
}
