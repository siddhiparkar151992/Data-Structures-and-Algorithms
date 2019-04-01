package main.java.algorithms;

/**
 * Created by Siddhi Parkar on 09-01-2018.
 */
public class MinHeap {

    public void replaceMin(int[][] heapArr, int[] arr){
        heapArr[0] = arr;
    }
    public void buildHeap(int[][] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            minheapify(arr, i);
        }

    }

    public void minheapify(int[][] arr, int i) {
        int l = 2 * i + 1;
        int r = l + 1;
        int min = i;
        if (l < arr.length && arr[l][0] < arr[min][0]) {
            min = l;
        }

        if (r < arr.length && arr[r][0] < arr[min][0]) {
            min = r;
        }

        if (min != i) {
            int[] temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            minheapify(arr, min);
        }
    }
}
