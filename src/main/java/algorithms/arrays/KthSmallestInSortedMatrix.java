package main.java.algorithms.arrays;

public class KthSmallestInSortedMatrix {


    class MinHeapNode {
        int elem;
        int r;
        int c;
        public MinHeapNode(int elem, int r , int c) {
            this.elem = elem;
            this.r=r;
            this.c=c;
        }

    }
    public void heapify(MinHeapNode[] heap, int i) {
        int smallest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < heap.length && heap[l].elem < heap[smallest].elem) {
            smallest = l;
        }
        if (r < heap.length && heap[r].elem < heap[smallest].elem) {
            smallest = r;
        }
        if (smallest != i) {
            MinHeapNode temp = heap[smallest];
            heap[smallest] = heap[i];
            heap[i] = temp;

            heapify(heap, smallest);
        }

    }

    public void findKthSmallestElement(int[][] matrix, int k) {
        MinHeapNode[] heap = new MinHeapNode[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            heap[i] = new MinHeapNode(matrix[0][i], 0, i);
        }


        int min= heap[0].elem;
        for (int i=0;i<k;i++) {


            MinHeapNode node = heap[0];

            min = node.elem;
            int nextValue = node.r+1< matrix[0].length?
                     matrix[node.r+1][node.c]: Integer.MAX_VALUE;
            heap[0]= new MinHeapNode(nextValue, node.r+1, node.c);
            heapify(heap, 0);

        }

        System.out.println(min);

    }

    public static void main(String... args) {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 25, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        KthSmallestInSortedMatrix k = new KthSmallestInSortedMatrix();
        k.findKthSmallestElement(mat, 5);

    }
}
