package main.java.algorithms.arrays;

public class MaximumSumOfElementsDivisibleByK {
    static int [][]dp = new int[1001][1001];

    public static int find(int[] arr, int i,int sum, int k) {
        if (dp[i][sum] != -1) {
            return dp[i][sum];
        }
        int ans = 0;

        int f =  find(arr, i+1, sum, k);
        if ((sum + f) % k == 0 ) {
            ans = sum + f;
        }
        int g =  find(arr, i+1, sum + arr[i], k);
        if ((sum + arr[i] + g )%k == 0) {
            ans =Math.max(ans, sum + arr[i] + g);
        }

        return dp[i][sum] = ans;
    }

    public static void main(String... args){
        int []arr = { 43, 1, 17, 26, 15 };
        int k = 16;
        for (int i = 0; i < 1001; i++)
            for (int j = 0; j < 1001; j++)
                dp[i][j] = -1;

        System.out.println(find(arr, 0, 0, k) );
    }
}
