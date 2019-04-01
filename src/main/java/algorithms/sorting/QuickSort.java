package main.java.algorithms.sorting;

public class QuickSort {

	public int partition(int[] arr, int first, int last) {
		int pivot = first;
		int l = first + 1;
		int r = last;
		while (true) {

			while (l <= r && arr[l] <= arr[pivot]) {
				l++;
			}
			while (r >= l && arr[r] >= arr[pivot]) {
				r--;
			}
			if (r < l) {

				break;
			} else {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}

		}
		int temp = arr[pivot];
		arr[pivot] = arr[r];
		arr[r] = temp;
		return r;
	}

	public int[] sort(int[] arr, int l, int r) {
		if (l < r) {
			int splitPoint = partition(arr, l, r);
			sort(arr, 0, splitPoint - 1);
			sort(arr, splitPoint + 1, r);
			return arr;
		}

		return null;
	}

	public static void main(String[] args) {
		QuickSort q = new QuickSort();
		int[] in = new int[] { 54, 26, 93, 17, 77, 31, 44, 55, 20 };
		int[] output = q.sort(in, 1, in.length - 1);
		System.out.println(output);

	}
}
