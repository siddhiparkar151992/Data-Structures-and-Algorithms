package main.java.algorithm.morganstanley;

import java.util.Arrays;

public class MaxHeap {
	public int getTop(int[] arr){
		if(arr.length==0){
			return -1;
		}
		return arr[0];
	}
	public int deleteRoot(int[] arr){
		int del = arr[0];
		int[] mod = new int[arr.length-1];
		for(int i =1;i<arr.length;i++){
			mod[i] = arr[i];
		}
		maxHeapify(arr, 0);
		return del;
	
	}
	
	public void insert(int n, int[] arr){
		int[] arr1 = new int[arr.length+1];
		arr1 = Arrays.copyOf(arr, arr.length+1);
		arr1[arr1.length-1] = n;
		maxHeapify(arr1, 0);
	}
	public void maxHeapify(int[] arr, int i) {
		int l = 2 * i + 1;
		int r = l + 1;
		int max = i;
		if (l < arr.length && arr[l] > arr[max]) {
			max = l;
		}
		if (r < arr.length && arr[r] > arr[max]) {
			max = r;
		}
		if (i != max) {
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
			maxHeapify(arr, i);
		}

	}

	public void heapify(int[] arr) {
		for (int i = arr.length / 2 - 1; i >=0 ; i--) {
			maxHeapify(arr, i);
		}
	}
}
