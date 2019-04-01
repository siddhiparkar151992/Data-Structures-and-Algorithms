package main.java.amazon.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Siddhi Parkar
 * @since 01-04-2019 20:46
 */
public class GenerateConsecutiveNumFromNWith1 {

    public void set(List<String> result, int n, StringBuilder currStr,
                             Character[] arr, boolean combinationFound, Character previousCharacter) {
        if (currStr.length() >= n) {
            if (combinationFound) {
                result.add(currStr.toString());
                System.out.println("--> "+ currStr.toString());
            }
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (previousCharacter == '1' && arr[i] == '1') {
                StringBuilder s = new StringBuilder(currStr);
                set(result, n, s.append(arr[i]), arr, true, arr[i]);

            } else {
                StringBuilder s = new StringBuilder(currStr);
                set(result, n, s.append(arr[i]), arr, combinationFound, arr[i]);

            }
        }
    }

    public static void main(String[] arrays) {
        GenerateConsecutiveNumFromNWith1 r = new GenerateConsecutiveNumFromNWith1();
        List<String> result = new ArrayList<>();
        r.set(result, 5, new StringBuilder(), new Character[]{'0', '1'}, false,
                new Character('0'));
    }
}
