package main.java.amazon;

public class ConnectNropesOfMinimumCost {
	public int getMinCost(int[] arr){
		HeapSort heapSort = new HeapSort();
		heapSort.buildHeap(arr);
		int minCost = 0;
		
		while(arr.length >1 ){
			int f =  heapSort.removeMin(arr, arr[arr.length-1]);
			int s =  heapSort.removeMin(arr, arr[arr.length-1]);
			minCost+=f+s;
			int[] newArr = heapSort.insert(arr, minCost);
		}
		return minCost;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
