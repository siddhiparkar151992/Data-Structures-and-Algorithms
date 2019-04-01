package main.java.algorithms.dp;

public class FindNumberOfPathsInMatrix {

	public void findPathUtil(boolean[][] visited, int[][] matrix, int i, int j, String path) {
		int r = matrix.length;
		int c = matrix[0].length;

		if (i == r - 1 && j == c - 1) {
			System.out.println(path);
			return;
		}
		if (i >= 0 && j >= 0 && i < r && j < c) {
			visited[i][j] = true;
			path += matrix[i][j] + " ";
			int[] row = new int[] { 0, -1, 1 };
			int[] col = new int[] { 1, 0, 0 };
			for (int m = 0; m < 3; m++) {
				if (i + row[m] >= 0 && j + col[m] >= 0 && i + row[m] < r && j + col[m] < c
						&& !visited[i + row[m]][j + col[m]]) {
					findPathUtil(visited, matrix, i + row[m], j + col[m], path);
				}
			}
			visited[i][j] = false;
		}
	}

	public void findPaths(int[][] matrix, int m, int n) {
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		findPathUtil(visited, matrix, m, n, "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNumberOfPathsInMatrix f = new FindNumberOfPathsInMatrix();
		f.findPaths(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, 0, 0);
	}

}
