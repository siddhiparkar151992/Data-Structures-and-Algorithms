package main.java.amazon;

public class KthlargestElementInAStream {

	private HeapSort heapSorter = new HeapSort();

	public void getKthLargetElement(int[] arr, int k) {
		int[] heapArr = new int[k];
		for (int i = 0; i < arr.length; i++) {
			if (i < k - 1) {
				heapArr[i] = arr[i];
			} else {
				if (i == k - 1) {
					heapArr[i] = arr[i];
					heapSorter.buildHeap(heapArr);

				} else if (arr[i] > heapArr[0]) {
					heapSorter.removeMin(heapArr, arr[i]);

				}
				System.out.println(heapArr[0]);

			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthlargestElementInAStream k = new KthlargestElementInAStream();
		int[] a = new int[] { 23, 10, 15, 70, 5, 80, 100 };
		k.getKthLargetElement(a, 3);

	}

}
