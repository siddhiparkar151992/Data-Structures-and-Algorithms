package main.java.amazon;

public class FindElementBeforeLessAndAfterMore {

	public int findElement(int[] arr) {
		int[] leftMax = new int[arr.length];

		for (int i = 0; i < leftMax.length; i++) {
			if (i == 0) {
				leftMax[i] = arr[i];
			} else {
				leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
			}
		}
		int rightMin = Integer.MAX_VALUE;

		for (int i = arr.length - 1; i >= 0; i--) {
			
			if (i < arr.length - 1) {
				rightMin = Math.min(rightMin, arr[i+1]);
			}
			if (leftMax[i] < arr[i] && rightMin > arr[i]) {
				return arr[i];
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElementBeforeLessAndAfterMore f = new FindElementBeforeLessAndAfterMore();
		int r = f.findElement(new int[] { 5, 1, 4, 3, 6, 8, 10, 7, 9 });
		System.out.println(r);
	}

}
