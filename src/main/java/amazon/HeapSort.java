package main.java.amazon;

import main.java.algorithms.arrays.heap.Heap;

public class HeapSort {

	public static void main(String[] args) {
		HeapSort h = new HeapSort();
		int[] arr= new int[] {2, 5, 2, 8, 5, 6, 8, 8};
		h.sort(arr);
		System.out.println(arr);
	}
	public int removeMin(int[] arr, int k) {
		
		int min = arr[0];
		arr[0] = k;
		minheapify(arr, 0);
		return min;
	}
	
	public int[] insert(int[] arr, int e){
		int[] newArr = new int[arr.length+1];
		for(int i=0;i<newArr.length;i++){
			if(i >= arr.length){
				newArr[i] =  e;
			}else{
				newArr[i] = arr[i];
			}
		}
		int i = arr.length-1;
		while(e< arr[(i-10)/2]){
			newArr[i] = newArr[(i-1)/2];
			i = (i-1)/2;
		}
		return newArr;
	}

	public void minheapify(int[] arr, int i) {
		int min = i;
		int l = 2 * i;
		int r = l + 1;
		if (l < arr.length && arr[l] < arr[min]) {
			min = l;
		}
		if (r < arr.length && arr[r] < arr[min]) {
			min = r;
		}

		if (min != i) {
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			minheapify(arr, min);
		}
	}

	public void buildHeap(int[] arr) {
		int n = arr.length;
		for (int i = n / 2; i >= 0; i--) {
			minheapify(arr, i);
		}
	}

	public void sort(int[] arr) {
		int n = arr.length;
		buildHeap(arr);
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			minheapify(arr, i);
		}
	}

}
