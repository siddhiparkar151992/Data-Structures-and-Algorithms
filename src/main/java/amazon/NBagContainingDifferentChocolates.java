package main.java.amazon;

import java.util.Arrays;

import main.java.algorithms.arrays.heap.Heap;

public class NBagContainingDifferentChocolates {
	HeapSort heap = new HeapSort();

	public int[] findMaxK(int[] arr, int k) {
		int[] arr1 = new int[k];
		int r= 0;
		arr1 = Arrays.copyOfRange(arr, 0, k);
		heap.buildHeap(arr1);
		for (int j = k; j < arr.length; j++) {
			if(arr1[0] < arr[j]){
				
				heap.removeMin(arr1, arr[j]);
				r+=arr1[arr1.length-1];
			}
			
		}
		return arr1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMaxKinMillionNumbers f = new FindMaxKinMillionNumbers();
		int[] r = f.findMaxK(new int[] { 5, 2, 3, 90, 67, 45 }, 3);
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i] + " ");
		}
	}

}
