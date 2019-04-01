package main.java.amazon;

public class GoldMineProblem {

	public void maxGold(int[][] matrix) {
		int[][] dp = new int[matrix.length][matrix[0].length];
		int rowLen = matrix.length;
		int colLen = matrix[0].length;
		for (int col = colLen - 1; col >= 0; col--) {
			for (int row = 0; row < rowLen; row++) {
				int right = col == colLen-1 ? 0 : dp[row][col+1];
				int rightUp = (row == 0 || col == colLen -1)? 0: dp[row-1][col+1];
				int rightdown = (row == rowLen -1 || col == colLen-1  )? 0: dp[row+1][col+1];
				dp[row][col] = matrix[row][col] + Math.max(Math.max(right, rightdown), rightUp);
			}
		}
		
		int res = dp[0][0];
	    for (int i=1; i<rowLen; i++)
	        res = Math.max(res, dp[i][0]);
	    System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoldMineProblem g= new GoldMineProblem();
		g.maxGold(new int[][]{ {1, 3, 1, 5},
	        {2, 2, 4, 1},
	        {5, 0, 2, 3},
	        {0, 6, 1, 2}
	    });
	}

}
