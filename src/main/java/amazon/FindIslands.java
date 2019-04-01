package main.java.amazon;

public class FindIslands {

	public boolean isSafe(int[][] arr, int rowLen, int colLen, int ri, int ci, boolean[][] visited) {
		if (ri < 0 || ci < 0 || ri > rowLen || ci > colLen || visited[ri][ci] || arr[ri][ci]!=1) {
			return false;
		}
		return true;
	}

	public void DFS(int[][] arr, boolean[][] visited, int row, int col) {
		visited[row][col] = true;
		int[] rows = { -1, -1, -1, 0, 1, 1, 1, -1 };
		int[] cols = { -1, 0, 1, 1, 1, 0, -1, 0 };
		for (int k = 0; k < rows.length; k++) {

			if (isSafe(arr,arr.length - 1, arr[0].length - 1, row + rows[k], col + cols[k], visited)) {
				DFS(arr, visited, row + rows[k] ,col+cols[k]);
			}

		}
		

	}

	public int findIslands(int[][] arr) {
		boolean[][] visited = new boolean[arr.length][arr[0].length];
		int count=0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == 1 && !visited[row][col]){
					DFS(arr, visited, row, col);
					count++;
				}
					
			}
		}
		System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		FindIslands f = new FindIslands();
		f.findIslands(new int[][] { { 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1 }, { 1, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 0, 1 } });
	}

}
