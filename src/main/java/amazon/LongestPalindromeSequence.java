package main.java.amazon;

/**
 * Created by Siddhi Parkar on 16-11-2017.
 */
public class LongestPalindromeSequence {

    public static void find(String[] str) {
        boolean[][] isPalindrome = new boolean[str.length][str.length];
        for (int i = 0; i < str.length; i++) {
            isPalindrome[i][i] = true;
        }

        for (int i = 0; i < str.length - 1; i++) {
            if (str[i] == str[i + 1]) {
                isPalindrome[i][i + 1] = true;
            }
        }

        for (int k = 3; k < str.length; k++) {
            for (int i = 0; i < str.length - k + 1; i++) {
                int lastIndex = i + k - 1;
                if (str[i] == str[lastIndex] && isPalindrome[i + 1][lastIndex - 1]) {
                    isPalindrome[i][lastIndex] = true;
                }
            }
        }
        System.out.print("");
    }

    public static void main(String[] args) {
        find(new String[]{"f", "g", "r", "a", "d", "a", "r", "i", "g", "f"});
    }
}
