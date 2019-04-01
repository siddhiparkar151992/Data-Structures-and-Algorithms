package main.java.algorithms.arrays;

public class ArrayRotation {
	static int gcd(int a, int b) {
		while (a != 0 && b != 0) // until either one of them is 0
		{
			int c = b;
			b = a % b;
			a = c;
		}
		return a + b; // either one is 0, so return the non-zero value
	}

	public void rotateArray(int[] arr, int d) {
		int i = 0;
		int currentElemAtThatPos = arr[0];
		int count = 0;
		while (count != arr.length) {

			for (int m = 0; m < (arr.length / d); m++) {
				count += 1;
				int positionToMove = -1;
				if ((i - d) < 0) {
					positionToMove = arr.length - d + i;
				} else {
					positionToMove = i - d;
				}
				int nextElem = arr[positionToMove];
				arr[positionToMove] = currentElemAtThatPos;
				currentElemAtThatPos = nextElem;
				i = positionToMove;
			}
			i = (i-1) <0 ? arr.length-i-1 : i-1;
			currentElemAtThatPos = arr[i];

		}
		System.out.println(arr);
	}

	public static void main(String[] args) {
		ArrayRotation r = new ArrayRotation();
		r.rotateArray(new int[] { 1, 2, 3, 4, 5, 6}, 2);
	}
}
