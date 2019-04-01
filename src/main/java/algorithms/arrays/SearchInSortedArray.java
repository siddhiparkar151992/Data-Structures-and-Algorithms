package main.java.algorithms.arrays;

public class SearchInSortedArray {

	private int binarySearch(int elementTosearch, int[] arr, int low, int high) {
		if (high < low) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (elementTosearch == arr[mid])
			return mid;
		else if (elementTosearch < arr[mid])
			binarySearch(elementTosearch, arr, low, mid-1);
		return binarySearch(elementTosearch, arr, mid+1, high);
	}

	public static void main(String[] args) {
		SearchInSortedArray s = new SearchInSortedArray();
		System.out.println(s.binarySearch(5,new int[]{1,4,5,8,100}, 0, 4));
		System.out.println(s.binarySearch(5,new int[]{1,4,5,8,100}, 0, 4));
		System.out.println(s.binarySearch(5,new int[]{1,4,5,8,100,101}, 0, 5));
		System.out.println(s.binarySearch(-1,new int[]{1,4,5,8,100}, 0, 4));
	}
}
