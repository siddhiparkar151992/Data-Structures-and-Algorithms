package main.java.algorithms.strings;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RemoveInvalidPranthesis {

    public void find(String str) {

        if (str.isEmpty()) {
            return;
        }
        HashMap<String, Boolean> map = new HashMap<>();

        Queue<String> q = new LinkedList<>();
        q.add(str);
        while (!q.isEmpty()) {

            String cur = q.poll();
            if (isValid(cur)) {
                System.out.println(cur);
                continue;
            }


        }
    }

    private boolean isValid(String cur) {
        int cnt = 0;
        for (int i = 0; i < cur.length(); i++) {
            if (cur.charAt(i) == '(') {
                cnt++;
            } else if (cur.charAt(i) == ')') {
                cnt--;
            } else if (cnt<0) {
                return false;
            }
        }
        return cnt == 0;

    }

    public static void main(String... args) {

    }
}
