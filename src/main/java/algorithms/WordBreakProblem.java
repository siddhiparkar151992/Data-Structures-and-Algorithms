package main.java.algorithms;

import java.util.Arrays;
import java.util.List;

public class WordBreakProblem {

    public void solve(List<String> dictionary, String str, int i, int curr, String currStr) {

//        System.out.println(currStr);
        if (i>= str.length()) {
            System.out.println(currStr);
            return;
        }

        for (int j = i + 1; j <= str.length(); j++) {
            String brokenword= str.substring(i, j);

            if (dictionary.contains(brokenword)) {
                solve(dictionary, str, j, curr, currStr+" "+brokenword);
            }
        }
    }

    public void solve(String str, List<String> dictionary) {
        solve(dictionary, str ,0, 0, "");
    }

    public static void main(String... args) {
        List <String> dict= Arrays.asList("mobile","samsung","sam","sung",
                "man","mango", "icecream","and",
                "go","i","love","ice","cream");
        String str1 = "iloveicecreamandmango";

        WordBreakProblem w = new WordBreakProblem();
        w.solve(str1,dict);

    }
}
