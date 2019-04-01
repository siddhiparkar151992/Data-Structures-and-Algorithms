package main.java.algorithms.dp;

public class MinimumNumOfStepstoreachEndOfArray {

	public int getMinSteps(int start, int end, int[] arr) {
		int[] jumps = new int[end];
		jumps[end-1] = 0;
		int min;
		for (int j = end - 2; j >= 0; j--) {
			if(arr[j] == 0) jumps[j] = Integer.MAX_VALUE;
			
			else if(arr[j] >=  end-j-1) jumps[j] =1;
			
			else{
				min = Integer.MAX_VALUE;
				for (int i = j + 1; i < end && i <= j + arr[j]; i++) {
					if(min > jumps[i]) min = jumps[i];
				}
				jumps[j] = min!=Integer.MAX_VALUE ? min+1: min;
			}
			
			
		}
		return jumps[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
		MinimumNumOfStepstoreachEndOfArray m = new MinimumNumOfStepstoreachEndOfArray();
		int r = m.getMinSteps(0, arr.length, arr);
		System.out.println(r);
	}

}
