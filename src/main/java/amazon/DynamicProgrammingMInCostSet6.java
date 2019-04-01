package main.java.amazon;

public class DynamicProgrammingMInCostSet6 {

	public class MinCost {
		int result = Integer.MAX_VALUE;
	}

	MinCost m = new MinCost();

	public int minCostUtil(int[][] arr, int i, int j) {
		if (i < 0 || j < 0) {
			return Integer.MAX_VALUE;
		}
		if (i == 0 && j == 0)
			return arr[i][j];
		return arr[i][j] + Math.min(minCostUtil(arr, i - 1, j - 1),
				Math.min(minCostUtil(arr, i - 1, j), minCostUtil(arr, i, j - 1)));
	}

	public int minCost(int[][] arr, int m, int n) {
		int[][] cost = new int[arr.length][arr.length];
		cost[0][0]= arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			cost[0][i] = cost[0][0] + arr[0][i];
		}
		for (int i = 0; i < arr.length; i++) {
			cost[i][0] = cost[0][0] + arr[i][0];
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				cost[i][j] = arr[i][j] +  Math.min(cost[i][j-1], Math.min(cost[i-1][j-1], cost[i-1][j]));
			}
		}
		return cost[m][n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicProgrammingMInCostSet6 d = new DynamicProgrammingMInCostSet6();
		System.out.println(d.minCost(new int[][] { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } }, 2, 2));
	}

}
