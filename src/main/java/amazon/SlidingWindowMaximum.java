package main.java.amazon;

public class SlidingWindowMaximum {

	HeapSort heap = new HeapSort();

	public void slidingWindowMax(int[] arr, int k) {
		int currentMaxIndex = 0;
		for (int i = 0; i < k; i++) {
			if(arr[i] > arr[currentMaxIndex]){
				currentMaxIndex = i;
			}
			
		}
		
		System.out.println(arr[currentMaxIndex]);
		for(int j=k;j<arr.length;j++){
			if(arr[currentMaxIndex] < arr[j]){
				currentMaxIndex =  j;
			}
			System.out.println(arr[currentMaxIndex]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlidingWindowMaximum s= new SlidingWindowMaximum();
		s.slidingWindowMax(new int[]{8, 5, 10, 7, 9, 4, 15, 12, 90, 13}, 4);
	}

}
