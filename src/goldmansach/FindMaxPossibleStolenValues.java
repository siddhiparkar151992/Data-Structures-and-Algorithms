package goldmansach;

public class FindMaxPossibleStolenValues {
	public static void findMaxStolen(int[] arr) {
		int[] dp = new int[arr.length];
		int max = 0;
		dp[0] = arr[0];
		dp[1] =  Math.max(arr[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {
			
			dp[i] = Math.max(dp[i-2]+arr[i], dp[i-1]);
			max = Math.max(dp[i], max);
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMaxStolen(new int[]{5, 3, 4, 11, 2});
	}

}
