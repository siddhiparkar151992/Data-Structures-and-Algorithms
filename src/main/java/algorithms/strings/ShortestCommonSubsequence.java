package main.java.algorithms.strings;

import java.util.Arrays;

public class ShortestCommonSubsequence {

    public int shortestComon(String s1, String s2, int i, int j, int[][] dp){

        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (i==0) {
            return dp[i][j] = j;
        }

        if (j==0) {
            return dp[i][j]= i;
        }
        if (s1.charAt(i) == s2.charAt(j)){
            dp[i][j]=1 + shortestComon(s1, s2, i-1, j-1, dp);
            return dp[i][j];
        }
        int l = shortestComon(s1, s2, i, j-1, dp);
        int r= shortestComon(s1, s2, i-1, j, dp);
        dp[i][j] = 1 + Math.min(l, r );

        return dp[i][j];
    }

    public static void main(String... args) {

        ShortestCommonSubsequence s = new ShortestCommonSubsequence();
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        int[][] dp = new int[X.length()+1][X.length()+1];

        for (int i=0;i<X.length();i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(
                "Length of the shortest"
                        + "supersequence is: "
                        + s.shortestComon(X, Y, X.length()-1, Y.length()-1, dp));
    }
}
