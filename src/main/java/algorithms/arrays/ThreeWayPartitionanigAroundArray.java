package main.java.algorithms.arrays;

public class ThreeWayPartitionanigAroundArray {
    public static void partition(int[] arr, int low, int high) {

        int[][] range = new int[3][3];
        range[0] = new int[] {Integer.MIN_VALUE, low-1};
        range[1] = new int[] {low, high-1};
        range[2] = new int[] {high, Integer.MAX_VALUE};
        for (int r=0;r<3;r++) {
            int clow= range[r][0];
            int chigh= range[r][1];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= chigh) {
                    int j = i;
                    while (j < arr.length ) {

                        if ( arr[j] >= clow && arr[j] <= chigh) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                        j++;
                    }

                }

            }
        }
    }

    public static void main(String... args) {

        int arr[] = { 1,  14, 5,  20, 4, 2, 54,
                20, 87, 98, 3,  1, 32 };

        int[] arr1 = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};

//        partition(arr, 10, 20);
//        System.out.println(arr);

        partition(arr1, 20, 20);
        System.out.println(arr1);
    }
}
