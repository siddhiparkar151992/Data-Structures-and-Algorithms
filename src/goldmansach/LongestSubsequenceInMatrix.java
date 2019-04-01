package goldmansach;

public class LongestSubsequenceInMatrix {
	
	class Result {
		int c= 0;
		int currMax = 0;
	}
	Result r= new Result();
	public void DFS(int[][] matrix, int i, int j, boolean[][] visited, Result r) {
		visited[i][j] = true;
		int[] row = { 0, 1 };
		int[] col = { 1, 0 };
		for (int k = 0; k < row.length; k++) {
			if(i+row[k]<matrix.length && j+col[k] < matrix[0].length && !visited[i+row[k]][j+col[k]]
					&& matrix[i+row[k]][j+col[k]]==1){
				r.currMax++;
				DFS(matrix, i+row[k], j+col[k], visited, r);
			}
		}
	}
	
	public void find(int[][] arr){
		boolean[][] visited= new boolean[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++){
			for(int j = 0;j<arr[0].length;j++){
				if(!visited[i][j] && arr[i][j]==1){
					int currMax = 0;
					DFS(arr, i, j, visited, r);
					
					r.c = Math.max(r.currMax, r.c);
					r.currMax = 0;
					
				}
			}
		}
		System.out.println(r.c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubsequenceInMatrix l = new LongestSubsequenceInMatrix();
		l.find(new int[][] {{0 ,0 ,0, 1, 1}, 
			{1, 1, 1, 0 ,1}, 
			{0, 1, 1, 1,0 },
			{0, 0, 1, 0, 0}, 
			{1, 1, 1, 1, 1}});
	}

}
