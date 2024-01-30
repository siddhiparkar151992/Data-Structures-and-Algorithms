package main.java.algorithms.strings;

public class LongestRepeatingSubsequence {

    public static int longest(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];


        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j]= 1+dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[m][n];

    }

    public static int longest(String s1) {
        int m = s1.length();
        int[][] dp = new int[m + 1][m + 1];


        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {

                if (s1.charAt(i-1) == s1.charAt(j-1) && i!=j){
                    dp[i][j]= 1+dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[m][m];

    }

    public static void main(String... args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(longest(s1, s2));
        System.out.println(longest("abc"));
        System.out.println(longest("aab"));
        System.out.println(longest("aabb"));
        System.out.println(longest("axxxy"));

    }
}
