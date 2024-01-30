package main.java.algorithms.strings;

public class FindPalindromicSubstring {


    public boolean isPalindrome(String str, int[][] dp, int i, int j) {
        if (str.length() % 2 == 0) {
            int start = 0;
            int end = str.length() - 1;
            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    dp[i][j] = -1;
                    return false;
                }
                start++;
                end--;
            }
        } else {
            int start = 0;
            int end = str.length() - 1;
            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    dp[i][j] = -1;
                    return false;
                }
                start++;
                end--;
            }

        }
        dp[i][j] = 1;
        return true;
    }

    public void palindromicSubStrings(String str, int start, int[][] dp, int[] singles) {


        if (start >= str.length()) {
            return;
        }
        if (singles[str.charAt(start)] == 0) {
            System.out.println(str.charAt(start));
            singles[str.charAt(start)] = 1;
        }
        for (int i = start + 1; i < str.length(); i++) {
            if (dp[start][i] == 1 || dp[start][i] == -1) {
                continue;
            }
            String substr = str.substring(start, i + 1);
            if (isPalindrome(substr, dp, start, i)) {
                System.out.println(substr);
            }
        }
        palindromicSubStrings(str, start + 1, dp, singles);
    }

    public static void main(String... args) {
        String str = "abaaa";
        FindPalindromicSubstring f = new FindPalindromicSubstring();
        int[][] dp = new int[str.length() + 1][str.length() + 1];
        int[] s = new int[256];
        f.palindromicSubStrings(str, 0, dp, s);
    }
}
