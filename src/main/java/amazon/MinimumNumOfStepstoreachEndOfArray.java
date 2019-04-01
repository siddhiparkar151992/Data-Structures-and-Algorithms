package main.java.amazon;

public class MinimumNumOfStepstoreachEndOfArray {

	public int getMinSteps(int start, int end, int[] arr) {
		if (start == end)
			return 0;
		if (arr[start] == 0)
			return Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = start + 1; i <= end && i <= i + arr[i]; i++) {
			int jumps = getMinSteps(i, end, arr);
			if (jumps != Integer.MAX_VALUE && jumps + 1 < min) {
				min = jumps + 1;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
		MinimumNumOfStepstoreachEndOfArray m = new MinimumNumOfStepstoreachEndOfArray();
		int r = m.getMinSteps(0, arr.length - 1, arr);
		System.out.println(r);
	}

}
