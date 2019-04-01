package main.java.amazon;

public class FindMaxConsecutiveSum {

	public class MaxSum {
		int sum = 0;
	}
	MaxSum s = new MaxSum();

	public void maxSum(int[] arr, int i, int currSum, MaxSum sum) {
		if(i >= arr.length) return;
		currSum += arr[i];
		if (currSum > sum.sum) {
			sum.sum = currSum;
		}
		for (int k = i + 2; k < arr.length; k++) {
			maxSum(arr, k, currSum, sum);
		}
	}

	public void findMax(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			maxSum(arr, i, 0, s);
		}
		System.out.println(s.sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMaxConsecutiveSum f= new FindMaxConsecutiveSum();
		f.findMax(new int[]{5,7,10,11,2,3,9});
		
	}

}
