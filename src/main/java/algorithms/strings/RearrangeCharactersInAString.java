package main.java.algorithms.strings;

import java.util.Arrays;

public class RearrangeCharactersInAString {

    public static void rearrange(String str1) {

        char[] arr = new char[str1.length()];
        for (int h=0;h<str1.length();h++) {
            arr[h] = str1.charAt(h);
        }
        int i=0;

        int n =str1.length();
        while(i <= n){
            if (i+1<n && arr[i] == arr[i+1]) {
                int j = i+1;
                while (j<str1.length()) {
                    if (arr[j]!= arr[i+1]) {
                        char t = arr[i+1];
                        arr[i+1] = arr[j];
                        arr[j] = t;
                        break;
                    }
                    j++;
                }
            }
            i++;
        }

        System.out.println(arr.toString());

    }

    public static void main(String...args) {
        rearrange("aaabb");
    }
}
