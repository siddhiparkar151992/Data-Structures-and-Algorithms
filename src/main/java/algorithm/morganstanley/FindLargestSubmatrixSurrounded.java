package main.java.algorithm.morganstanley;

public class FindLargestSubmatrixSurrounded {

	public static int find(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		int[][] hor = new int[row][col];
		int[][] ver = new int[row][col];
		for (int i = 0; i < row; i++) {
			hor[i][0] = matrix[i][0];
		}

		for (int i = 0; i < col; i++) {
			ver[0][i] = matrix[0][i];
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(matrix[i][j]!=0){
					if (j - 1 >= 0 && j - 1 <= col) {
						hor[i][j] = hor[i][j - 1] + 1;
					}

					if (i - 1 >= 0 && i - 1 <= row) {
						ver[i][j] = ver[i - 1][j] + 1;
					}
				}else{
					hor[i][j] = ver[i][j] =0;
				}
				
			}
		}
		int max = 1;
		for (int i = row - 1; i >= 1; i--) {
			for (int j = col - 1; j >= 1; j--) {
				int small = Math.min(hor[i][j], ver[i][j]);

				while (small > max) {
					if (hor[i - small + 1][j] >= small && ver[i][j - small + 1] >= small)
						max = small;
					small--;
				}

			}
		}
		return max;
	}

	public static void main(String[] args) {
		int mat[][] = { { 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 0, 1 }, { 1, 1, 1, 0, 0, 1 }, { 0, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 0 }, { 0, 0, 1, 0, 0, 0 }, };
		System.out.println(find(mat));
	}

}
