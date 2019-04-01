package main.java.algorithms.arrays.heap;

public class MinHeap {
	
	
	public int[] insert(int[] arr, int i){
		arr[arr.length- 1] = i;
		heapify(arr, arr.length, 0);
		return arr;
	}
	public void heapify(int[] arr, int n, int i){
		int min = i;
		int l = i*2+1;
		int r = l+1;
		if(l<n && arr[l] < arr[min]){
			min = l;
		}
		if(r<n && arr[r]< arr[min]){
			min = r;
		}
		
		if(min!=i){
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			heapify(arr, n, min);
		}
	}
	
	public void buildHeap(int[] arr){
		int n = arr.length;
		for(int i= n/2-1;i>=0;i--){
			heapify(arr, n, i);
		}
	}
	public void sort(int[] arr){
		
		int n = arr.length;
		buildHeap(arr);
		for(int i= n-1;i>=0;i--){
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heapify(arr, i, 0);
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
