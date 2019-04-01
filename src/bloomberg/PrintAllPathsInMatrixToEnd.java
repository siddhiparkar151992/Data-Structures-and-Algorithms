package bloomberg;

public class PrintAllPathsInMatrixToEnd {

	public void DFS(boolean[][] visited, int[][] matrix, int x, int y, String cpath) {
		cpath += matrix[x][y];
		if (x == matrix.length - 1 && y == matrix[0].length - 1) {
			System.out.println(cpath);
			return;
		}
		
		// visited[x][y] = true;
		int[] row = new int[] { 0, 1, 1 };
		int[] col = new int[] { 1, 1, 0 };
		for (int i = 0; i < row.length; i++) {
			if (row[i] + x < matrix.length && col[i] + y < matrix[0].length) {
				DFS(visited, matrix, row[i] + x, col[i] + y, cpath);
			}
		}

	}

	public void printAllPaths(int[][] matrix) {
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		DFS(visited, matrix, 0, 0, "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintAllPathsInMatrixToEnd p = new PrintAllPathsInMatrixToEnd();
		p.printAllPaths(new int[][] { { 1, 1, 1 }, { 0, 0, 1 }, { 0, 0, 1 } });
	}

}
