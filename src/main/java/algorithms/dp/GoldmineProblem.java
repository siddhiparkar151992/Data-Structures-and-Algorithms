package main.java.algorithms.dp;

public class GoldmineProblem {

	public static void goldmine(int[][] arr) {
		int r = arr.length;
		int c = arr[0].length;
		int[][] dp = new int[r][c];
		for(int i=0;i<c;i++){
			for(int j = 0;j< r;j++){
				int right = i-1 >=0  ? dp[j][i-1]: 0;
				int rightUp = i-1 >=0  && j-1 >= 0 ? dp[j-1][i-1]: 0;
				int rightDown= i-1 >=0  && j+1 < r? dp[j+1][i-1]: 0;
				dp[j][i] = arr[j][i] + Math.max(right, Math.max(rightUp, rightDown));
			}
		}
		System.out.println(dp[r-1][c-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		goldmine(new int[][]  {{1, 3, 3},
            {2, 1, 4},
           {0, 6, 4}});
	}

}
