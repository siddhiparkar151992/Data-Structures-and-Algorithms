package main.java.amazon;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Siddhi Parkar on 19-03-2018.
 */
public class StringCombinationWithHashMap {
    public static void main(String[] args) {
        Map<Character, Object[]> map = new HashMap<>();
        map.put('f', new Object[]{'F', 4});
        map.put('b', new Object[]{'B', 8});
        print("fab", map);
    }

    public static void printUtil(String str, Map<Character, Object[]> map, int currentIndex) {
        if (currentIndex == str.length()) return;
        System.out.println(str);
        Object[] next = map.get(str.charAt(currentIndex));
        if(next==null) return;
        for (int i = 0; i < next.length; i++) {
            printUtil(str.substring(0, i)+next[i]+str.substring(i+1), map, currentIndex+1);
        }
    }

    public static void print(String str, Map<Character, Object[]> map) {
        printUtil(str, map, 0);
    }
}
