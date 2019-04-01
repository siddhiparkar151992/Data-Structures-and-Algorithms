package main.java.algorithms.arrays.heap;

public class FindKLargestElements {
	public static void main(String[] args){
		MinHeap m = new MinHeap();
		int[] arr = {12, 11, 13, 5, 6, 7};
		int k =3;
		int n = arr.length;
		for(int i=0;i<k;i++){
			m.heapify(arr, n, i);
		}
		
		for(int i=k;i<n-1;i++){
			if(arr[i] > arr[0]){
				int temp =arr[i];
				arr[i] = arr[0];
				arr[0] = temp;
				m.heapify(arr,n, i);
			}
		}
		
		m.printArray(arr);
	}
}
