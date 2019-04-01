package main.java.amazon;

public class FillArrays1sInMinimumIteration {

	public static void fill(int[] arr) {
		boolean oneFound = false;
		boolean zeroFound = false;
		int zeroIndex = -1;
		int oneIndex = -1;
		int zeroCount = 0;
		int i = 0;
		int result = 0;
		while (i < arr.length) {
			if (arr[i] == 0) {
				if(i==arr.length-1) {
					result = Math.max(zeroCount, result);
				}
				zeroCount++;
				zeroFound = true;
			}
			if (arr[i] == 1) {
				if (zeroFound && !oneFound) {
					result = Math.max(result, zeroCount);
				} else if (oneFound && zeroFound) {
					result = Math.max(result, zeroCount / 2);
				}
				zeroCount = 0;
				oneFound = true;
				oneIndex = i;
				zeroFound = false;
			}
			i++;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fill(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 
                1, 1, 1, 1, 0, 0, 0, 0});
	}

}
