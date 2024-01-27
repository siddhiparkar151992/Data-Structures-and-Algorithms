package main.java.algorithms.strings;

public class LongestPalindromicSubstring {

    public static int find(String str) {

        int n = str.length();
        int maxLength = 0;

        int startLen = 0;
        int endLen = 0;
        for (int i=0;i<str.length();i++) {
            int currentLength = 0;
            int currentChar = str.charAt(i);
            int start = i-1;
            int end =i+1;
            while(start >=0 & end< n && str.charAt(start) == str.charAt(end)) {
                currentLength++;
                start--;
                end++;

            }
            currentLength++;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                startLen = start;
                endLen = end;
            }
            currentLength=0;
             start = i;
             end =i+1;
            while (start>=0 && end<n && str.charAt(start) == str.charAt(end)) {
                start--;
                end++;
                currentLength++;
            }
            start++;
            end--;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                startLen = start;
                endLen = end;
            }
        }

        System.out.println(str.substring(startLen, endLen+1));
        return maxLength;
    }

    public static void main(String... args) {
        System.out.println(find("forgeeksskeegfor"));
        System.out.println(find("hjghjghjgforrof"));
        System.out.println(find("hjghjghjgfoof"));
    }
}
