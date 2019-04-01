package main.java.amazon;

public class BooleanMatrix {

	public void fillNeighbours(int[][] arr, int rowLen, int colLen, int i, int j, boolean[][] visited) {
		int rowStart = 0;
		int rowEnd = rowLen;
		int colStart = 0;
		int colEnd = colLen;
		if (i == 0) {
			rowStart = 1;

		}
		if (j == 0) {
			colStart = 1;

		}
		for (int x = rowStart; x < rowEnd; x++) {
			if (!visited[x][j]) {
				arr[x][j] = 1;
			}
		}

		for (int y = colStart; y < colEnd; y++) {
			if (!visited[i][y]) {
				arr[i][y] = 1;
			}
		}
	}

	public void fill(int[][] arr) {
		int rowLen = arr.length;

		int colLen = arr[0].length;
		boolean[][] visited = new boolean[rowLen][colLen];
		for (int i = 0; i < rowLen; i++) {
			for (int j = 0; j < colLen; j++) {
				int currentItem = arr[i][j];
				if (currentItem == 1) {
					fillNeighbours(arr, rowLen, colLen, i, j, visited);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BooleanMatrix b = new BooleanMatrix();
		int[][] arr = { { 0, 0, 0 }, { 0, 0, 1 } };
		b.fill(arr);
		System.out.println(arr);
	}

}
