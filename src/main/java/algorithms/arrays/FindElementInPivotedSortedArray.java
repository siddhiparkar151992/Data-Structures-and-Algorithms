package main.java.algorithms.arrays;

public class FindElementInPivotedSortedArray {

	public int getPivote(int[] arr) {
		int pivotIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 < arr.length - 1 && arr[i] > arr[i + 1]) {
				pivotIndex = i;
			}
		}
		return pivotIndex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
