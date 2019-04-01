package main.java.algorithm.morganstanley;

public class FindMaxSubMatrixOf1 {

	public static void findSubMatrix(int[][] arr) {
		int[][] a = new int[arr.length][arr[0].length];
		int r = arr.length;
		int c = arr[0].length;
		for (int i = 0; i < r; i++) {
			a[i][0] = arr[i][0];
		}

		for (int i = 0; i < c; i++) {
			a[0][i] = arr[0][i];
		}
		for (int i = 1; i < r; i++) {
			for (int j = 1; j < c; j++) {
				if (arr[i][j] == 1) {
					a[i][j] = 1 + Math.min(Math.min(a[i][j - 1], a[i - 1][j]), a[i - 1][j - 1]);
				} else {
					a[i][j] = 0;
				}

			}
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		int M[][] = { { 0, 1, 1, 0, 1 }, { 1, 1, 0, 1, 0 }, { 0, 1, 1, 1, 0 }, { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 },
				{ 0, 0, 0, 0, 0 } };

		findSubMatrix(M);

	}

}
