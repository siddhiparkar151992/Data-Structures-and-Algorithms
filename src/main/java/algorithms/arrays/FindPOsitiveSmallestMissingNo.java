package main.java.algorithms.arrays;

public class FindPOsitiveSmallestMissingNo {


    public static void find(int[] arr) {
        int largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[largest] < arr[i]) {
                largest = i;
            }
        }

        int[] largeArr = new int[arr[largest]+1];
        for (int i = 0; i < largeArr.length; i++) {
            largeArr[i] = 0;
        }
        for (int h = 0; h < arr.length; h++) {
            if (arr[h] >= 0) {
                largeArr[arr[h]] = 1;
            }
        }

        for (int g = 1; g < largeArr.length; g++) {
            if (largeArr[g] == 0) {
                System.out.println(String.format("missing elem- %s", g));
                break;
            }
        }
    }

    public static void main(String... args) {
        find(new int[]{1, 2, 3, 7, 6, 8, -1, -10, 15});
    }
}
