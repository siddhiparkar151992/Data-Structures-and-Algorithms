package main.java.algorithms.arrays;

public class LongestCommonsubSequence {

    public int lcs(String s1, String s2, int m, int n) {
        if (m <0 || n < 0) {
            return 0;
        }

        if (s1.charAt(m) == s2.charAt(n)) {
            return 1+ lcs(s1, s2, m-1, n-1);
        }
        return Math.max(lcs(s1, s2, m,n-1), lcs(s1, s2, m-1, n));
    }

    public int memoizationLCS(String s1, String s2, int m , int n, int[][] dp) {
        if (m <0 || n < 0) {
            return 0;
        }

        if (dp[m][n] != -1){
            return dp[m][n];
        }

        if (s1.charAt(m) == s2.charAt(n)) {
            dp[m][n] = 1+ memoizationLCS(s1, s2, m-1, n-1, dp);
            return dp[m][n];
        }
        dp[m][n] = Math.max(memoizationLCS(s1, s2, m,n-1, dp),
                memoizationLCS(s1, s2, m-1, n, dp));
        return dp[m][n];
    }

    public static void main(String... args) {
        LongestCommonsubSequence lcs
                = new LongestCommonsubSequence();
        String S1 = "AGGTAB";
        String S2 = "GXTXAYB";
        int m = S1.length();
        int n = S2.length();

        System.out.println("Length of LCS is"
                + " " + lcs.lcs(S1, S2, m, n));
    }
}
