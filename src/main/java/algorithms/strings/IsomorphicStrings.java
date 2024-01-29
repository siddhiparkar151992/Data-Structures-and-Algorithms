package main.java.algorithms.strings;

import java.util.Arrays;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String str1, String str2) {

        int size = 256;
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] map = new int[size];
        int[] reversemap = new int[size];
        Arrays.fill(reversemap, -1);

        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (map[c1] == -1) {
                if (reversemap[c2] != -1) {
                    return false;
                }
                map[c1] = c2;
                reversemap[c2] = c1;
            } else {
                if (reversemap[c2] != -1 || map[c1] != c2) {
                    return false;
                } 
            }
        }
        return true;
    }

    public static void main(String... args) {
        System.out.println(
                isIsomorphic("aabcccfg", "xxyhhhxy")
        );
    }
}
