package main.java.algorithms.strings;

public class FindMaxSubStringWithoutRepeatingChar {

    public static int findMaxLength(String str) {
        int n = 256;
        int[] map = new int[n];

        for (int i=0;i<n;i++) {
            map[i] = -1;
        }

        int cstart=0;
        int cend= 0;

        int cmaxWindow =0;
        for (int i=0;i<str.length();i++) {
            if(map[str.charAt(i)] == -1) {
                map[str.charAt(i)] = i;
                cend++;
            } else {
                cstart= map[str.charAt(i)]+1;
                cend++;
            }

            cmaxWindow = Math.max(cmaxWindow, cend-cstart);
        }

        return cmaxWindow;
    }
    public static void main(String... args) {
        System.out.println(findMaxLength("ABCDEFGABEF"));
    }
}
