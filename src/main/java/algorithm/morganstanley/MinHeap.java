package main.java.algorithm.morganstanley;

import java.util.Arrays;

public class MinHeap {
	
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
		minHeapify(arr, 0);
		return del;
		
	}
	
	public void minHeapify(int[] arr, int i){
		int min = i;
		int l = i*2+1;
		int r = l+1;
		if(l<arr.length && arr[l] < arr[min]){
			min = l;
		}
		if(r<arr.length && arr[r]< arr[min]){
			min = r;
		}
		
		if(min!=i){
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			minHeapify(arr,min);
		}
	}
	
	public void buildHeap(int[] arr){
		int n = arr.length;
		for(int i= n/2-1;i>=0;i--){
			minHeapify(arr, i);
		}
	}
	public void insert(int n, int[] arr){
		int[] arr1 = new int[arr.length+1];
		arr1 = Arrays.copyOf(arr, arr.length+1);
		arr1[arr1.length-1] = n;
		minHeapify(arr1, 0);
	}
	public void sort(int[] arr){
		
		int n = arr.length;
		buildHeap(arr);
		for(int i= n-1;i>=0;i--){
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			minHeapify(arr, i);
		}
	}
	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
 
        MinHeap ob = new MinHeap();
        ob.sort(arr);
 
        System.out.println("Sorted array is");
        printArray(arr);
    }
}

