package main.java.algorithms.arrays;


import main.java.algorithms.MinHeap;

/**
 * Created by Siddhi Parkar on 09-01-2018.
 */
public class MergeKSortedArrays {
    MinHeap heapSorter = new MinHeap();

    public static void main(String[] args) {
        int[][] arr = {{2, 6, 12, 34},
                {1, 9, 20, 1000},
                {23, 34, 90, 2000}};
        MergeKSortedArrays m = new MergeKSortedArrays();
        m.merge(arr, 4);
    }

    public void merge(int[][] arr, int n) {
        int k = arr.length;
        int[] output = new int[n * k];
        int[][] heap = new int[k][2];
        for (int i = 0; i < k; i++) {
            heap[i][0] = arr[i][0];
            heap[i][1] = i;
        }
        heapSorter.buildHeap(heap);
        heapSorter.minheapify(arr, 0);
        for (int i = 0; i < k * n; i++) {
            int[] min = heap[0];
            output[i] = min[0];
            int index = min[1];
            int[] toInsert;
            if (i + 1 < n) {
                toInsert = new int[]{arr[index][i + 1], index};
            } else {
                toInsert = new int[]{Integer.MAX_VALUE, index};
            }
            heapSorter.replaceMin(heap, toInsert);
            heapSorter.minheapify(heap, 0);
        }
    }
}
