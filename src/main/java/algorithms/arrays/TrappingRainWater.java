package main.java.algorithms.arrays;

public class TrappingRainWater {

    public static int trapRainWater(int[] arr) {
        int localMax = 0;
        int cmax = 0;
        int trappedWater = 0;

        for (int i = 0; i < arr.length; i++) {


            if (arr[i] >= arr[localMax]) {
                localMax = i;
            }
            if (arr[i] > 0 && arr[cmax] < arr[i]) {
                int height = Math.min(arr[cmax], arr[i]);
                trappedWater += height * (i - cmax-1);
                cmax = i;
                localMax = cmax+1;
            } else {
                trappedWater -= arr[i];
            }
        }
        for(int h=localMax;h<arr.length;h++) {
            trappedWater+=arr[h];
        }

            int height = Math.min(arr[cmax], arr[localMax]);
            trappedWater += height * (localMax - cmax);

        return trappedWater;
    }

    public static void main(String... args) {
        System.out.println(trapRainWater(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println(trapRainWater(new int[]{2, 0, 2}));
    }
}
