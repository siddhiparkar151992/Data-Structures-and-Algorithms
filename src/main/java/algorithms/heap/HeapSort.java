package main.java.algorithms.heap;

public class HeapSort {


    public void heapify(int[] arr, int i) {
        int largest = i;
        int l = i * 2 + 1;
        int r = l + 1;

        if (l < arr.length && arr[l] > arr[largest]) {
            int temp = arr[l];
            arr[l] = arr[largest];
            arr[largest] = temp;
        }

        if (r < arr.length && arr[r] > arr[largest]) {
            int temp = arr[r];
            arr[r] = arr[largest];
            arr[largest] = temp;
        }
        if (i != largest) {
            heapify(arr, largest);
        }

    }

    public void sortArray(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            heapify(arr, 0);
        }

        for (int j = n - 1; j >= 0; j--) {
            int temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            heapify(arr, 0);
        }

    }
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int N = arr.length;

        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String... args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        // Function call
        HeapSort ob = new HeapSort();
        ob.sortArray(arr);

        System.out.println("Sorted array is");
        printArray(arr);

    }
}
