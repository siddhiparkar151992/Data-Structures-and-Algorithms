package main.java.algorithms.arrays;

import main.java.algorithms.sorting.QuickSort;

public class FindTwoElemWhoseSumIsClosestToZero {

	public void find(int[] arr) {
		QuickSort q = new QuickSort();
		q.sort(arr, 0, arr.length - 1);
		int sum ;
		int l = 0;
		int r = arr.length - 1;
		int min_sum = arr[0]+arr[1];
		int min_l = l;
		int min_r = r;

		while (l < r) {
			sum = arr[l] +arr[r];
			if(Math.abs(min_sum) > Math.abs(sum)){
				min_sum = sum;
				min_l =l;
				min_r=r;
			}
		}
	}

	public static void main(String[] args) {

	}
}
