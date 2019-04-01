package main.java.algorithms.arrays;

public class LargestSumContiguousSubArray {

	public int getLargestSumSubarray(int[] arr) {
		int maxSofar = 0;
		int maxEndingHere = 0;
		for (int i = 0; i < arr.length; i++) {
			maxEndingHere += arr[i];
			if(maxEndingHere <0){
				maxEndingHere = 0;
			}
			if(maxSofar < maxEndingHere){
				maxSofar =  maxEndingHere;
			}
				
		}
		return maxSofar;
	}

	public static void main(String[] args) {

	}

}
