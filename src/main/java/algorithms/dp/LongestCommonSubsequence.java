package main.java.algorithms.dp;

/**
 * Created by Siddhi Parkar on 11-02-2018.
 */
public class LongestCommonSubsequence {
    public static void find(char[] arr1, char[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[][] L = new int[m + 1][n + 1];
        for (int i = m; i >= 0; i--) {
            for (int j = n; j >= 0; j--) {
                if (i == m || j == n) L[m][n] = 0;
                else if (arr1[i] == arr2[j]) {
                    L[i][j] = L[i+1][j+1]+1;
                }
                else{
                    L[i][j] = Math.max(L[i][j+1], L[i+1][j]);
                }
            }
        }
        System.out.println(L[0][0]);
    }

    public static void ewww(){
//        int q = 1/0;
        ewww();
    }
    public static void main(String[] args) {
//        String s1 = "AGGTAB";
//        String s2 = "GXTXAYB";
//
//        char[] X=s1.toCharArray();
//        char[] Y=s2.toCharArray();
//        find(X, Y);
        ewww();
    }
}
