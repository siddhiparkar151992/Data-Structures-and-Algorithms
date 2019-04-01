package main.java.amazon;

public class FindElementInDescreasingIncreasingArray {

	public int binSearch(int[] arr, int l, int h, int k) {
		if (l == h && arr[l] == k)
			return arr[l];
		int mid = (l + h) / 2;
		if (arr[mid] == k)
			return arr[mid];
		if ((arr[mid - 1] < arr[mid] || arr[mid-1] > arr[mid]) && arr[mid + 1] < arr[mid] && arr[mid] > k) {
			return binSearch(arr, mid + 1, h, k);
		}
		if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1] && arr[mid] < k) {
			return binSearch(arr, mid+1, h, k);
		}
		return binSearch(arr, l, mid-1, k);
	}

	public void find(int[] arr, int k) {
		System.out.println(binSearch(arr, 0, arr.length-1, k));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElementInDescreasingIncreasingArray f= new FindElementInDescreasingIncreasingArray();
		f.find(new int[] {1,2,3,4,10,9,8,7}, 10);
	}

}
