package main.java.algorithms.stack;

import java.util.Stack;

public class EvaluatePostFix {

    public static int operate(Character c, int l, int r) {

        if (c == '*') {
            return l * r;
        }
        if (c == '/') {
            return l / r;
        }
        if (c == '+') {
            return l + r;
        }
        if (c == '-') {
            return l - r;
        }
        return 0;
    }

    public static void postfix(String str) {
        int output = 0;
        Stack<Integer> stack = new Stack<>();

        int i =0;
        while (i < str.length()) {
            Character c = str.charAt(i);
            if (c == '*' || c == '-' || c == '/' || c == '+') {

                int l = 0;
                int r = 0;
                if (!stack.isEmpty()) {
                    l = stack.pop();
                }
                if (!stack.isEmpty()) {
                    r = stack.pop();
                }
                stack.push(operate(c, l, r));

            } else {
                stack.push(c - '0');
            }
            i++;
        }

        System.out.println(stack.pop());
    }

    public static void main(String... args) {
        postfix("231*+9-");
    }
}
