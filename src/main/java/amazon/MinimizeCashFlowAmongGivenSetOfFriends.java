package main.java.amazon;

public class MinimizeCashFlowAmongGivenSetOfFriends {

	public int getMin(int[] arr) {
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[min] > arr[i]) {
				min = i;
			}
		}
		return min;
	}

	public int getMax(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;
	}

	public void minCashFlowUtil(int[] amount) {
		int maxCredit = getMax(amount);
		int maxDebit = getMin(amount);
		if(amount[maxCredit] == 0 && amount[maxDebit] == 0){
			return;
		}
		int min = Math.min(Math.abs(amount[maxCredit]), Math.abs(amount[maxDebit]));
		amount[maxCredit]-= min;
		amount[maxDebit]+=min;
		
		System.out.println("Person "+ maxDebit+" pays "+min+" to Person "+maxCredit);
		minCashFlowUtil(amount);
		
	}

	public void minimizeCashFlow(int[][] arr) {
		int[] amount = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				amount[i] += arr[j][i] - arr[i][j];
			}
		}
		minCashFlowUtil(amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimizeCashFlowAmongGivenSetOfFriends m = new MinimizeCashFlowAmongGivenSetOfFriends();
		m.minimizeCashFlow(new int[][]{{0, 1000, 2000},{0, 0, 5000},{0, 0, 0},});
	}

}
