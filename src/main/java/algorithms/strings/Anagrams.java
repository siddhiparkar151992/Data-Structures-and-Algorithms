package main.java.algorithms.strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public static void anagrams (String text, String word) {
        Map<Character, Integer> wordMap = new HashMap<>();
        Map<Character, Integer> runningMap = new HashMap<>();
        for(Character c : word.toCharArray()){
            wordMap.put(c,wordMap.getOrDefault(c, 0)+1);
        }
        int result = 0;
        int window = word.length();
        int cw = word.length();

        int ci= 0;

        while (true) {
            if (ci >= text.length()){
                break;
            }
            char currentChar = text.charAt(ci);

            runningMap.put(currentChar, runningMap.getOrDefault(currentChar, 0)+1);
            if (ci>=window) {
                char removedChar=text.charAt(window-ci);
                if (runningMap.get(removedChar)== 1) {
                    runningMap.remove(removedChar);
                } else {
                    runningMap.put(removedChar, runningMap.getOrDefault(removedChar, 0)-1);
                }
            }
            if (ci-1==window && runningMap.equals(wordMap)){
                result++;
            }

            ci++;
        }
        System.out.println(result);
    }
    public static void main(String... args) {
        anagrams("forxxorfxdofr", "for");
    }
}
