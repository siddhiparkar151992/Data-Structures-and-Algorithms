package main.java.algorithms;

import java.util.Arrays;

public class KnapsackProblem {

    public int knapsack(int[] weights, int[] profits, int maxWeight, int i,
                         int cprofit, int[][] dp) {


        if (maxWeight<0){
            return 0;
        }

        if (maxWeight ==0){
            return cprofit;
        }
        if (i >= weights.length ) {
            return 0;
        }
        if (dp[i][maxWeight] !=-1) {
            return dp[i][maxWeight];
        }


        int considerNext = knapsack(weights, profits, maxWeight - weights[i], i+1,
                profits[i]+cprofit, dp);
        System.out.println(String.format("weight %s index %s profit %s -> %s",
                maxWeight-weights[i], i+1, profits[i]+cprofit, considerNext));
        int dontConsiderNext = knapsack(weights, profits, maxWeight, i+1 ,cprofit, dp);

        System.out.println(String.format("weight %s index %s profit %s -> %s",
                maxWeight, i+1, profits[i], dontConsiderNext));
        dp[i][maxWeight] = Math.max(considerNext, dontConsiderNext);
        return dp[i][maxWeight];
    }

    public void findMaxProfit(int[] weights, int[] profits, int maxWeight) {
        int[][] dp =new int[weights.length+1][maxWeight+1];
        for (int i=0;i<dp.length;i++) {
            Arrays.fill(dp[i],-1);

        }
        System.out.println(knapsack(weights, profits, maxWeight, 0, 0, dp));
        System.out.println("");
    }

    public void findMaxProfitOptimized(int[] weights, int[] profits, int maxWeight) {
        int[] dp =new int[maxWeight+1];
//        Arrays.fill(dp,-1);

        for (int i = 1;i<weights.length;i++) {
           for (int w=maxWeight;w>=0;w--) {
                if (weights[i-1] <= w) {
                    dp[w] = Math.max(dp[w],
                            dp[w-weights[i-1]+ profits[i-1]]);
                }
           }
        }
    }
    public static void main(String... args){
        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        KnapsackProblem k = new KnapsackProblem();
        k.findMaxProfit(weight, profit, W);
    }
}
