package main.java.algorithms.arrays;

import main.java.algorithms.arrays.heap.Data;
import main.java.algorithms.arrays.heap.GenericMinHeap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Siddhi Parkar on 26-01-2018.
 */
public class KthSmallestElemetnInRowColumnMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{ {10, 20, 30, 40},
                {15, 25, 35, 45},
                {25, 29, 37, 48},
                {32, 33, 39, 50},
        };
        KthSmallestElemetnInRowColumnMatrix k = new KthSmallestElemetnInRowColumnMatrix();
        k.find(matrix, 3);
    }

    public List<Data> populateHeap(int[][] matrix, int k) {
        List<Data> heap = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            heap.add(new Data(matrix[0][i], 0, i));
        }
        return heap;
    }

    public void find(int[][] matrix, int k) {
        GenericMinHeap<Data> heap = new GenericMinHeap<>(populateHeap(matrix, k));
        int c = 1;
        while(c<k){
            Data heapMin = heap.getMin();
            int row = heapMin.row;
            int col = heapMin.col;
            heap.replaceMin(new Data(matrix[row+1][col], row+1, col));
            heap.heapify(0);
            c++;
        }
        System.out.println(heap.getMin().elem);
    }

}
