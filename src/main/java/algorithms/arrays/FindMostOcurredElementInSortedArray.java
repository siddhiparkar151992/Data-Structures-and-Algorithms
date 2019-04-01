package main.java.algorithms.arrays;


public class FindMostOcurredElementInSortedArray {
	
		public boolean isMajority(int[] arr, int n){
			int i = binarySearch(arr, 0, arr.length-1, n);
			if((i!=-1 && (i+arr.length/2) <= arr.length-1) && arr[i+arr.length/2] == n){
				return true;
			}
			return false;
		}
		public int binarySearch(int[] arr, int low, int high, int n){
			if(high>low){
				int mid = (low+high)/2;
				if((mid ==0|| arr[mid-1]< n) && arr[mid]==n){
					return mid;
				}
				if(n < arr[mid]){
					return binarySearch(arr, low, mid-1, n);
				}
				return binarySearch(arr, mid+1, high, n);
			}
			return -1;
		}
		public static void main(String[] args){
			int[] array =  {1,1,2,2,2,3,3,3,3,3,4};
		}
}
