package main.java.amazon;

import java.util.Stack;

/**
 * Created by Siddhi Parkar on 10-03-2018.
 */
public class ReverseStackUsingRecursion {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        ReverseStackUsingRecursion r = new ReverseStackUsingRecursion();
        r.reverse(stack);
    }
    private void insert(Stack<Integer> stack, Integer elem ){
        if(stack.isEmpty()) {
            stack.push(elem);
        }else{
            int e = stack.pop();
            insert(stack, elem);
            stack.push(e);
        }
    }
    private void reverseUtil(Stack<Integer> stack) {
        if (stack.isEmpty()) return;
        Integer elem = stack.pop();
        reverseUtil(stack);
        insert(stack, elem);
    }

    public void reverse(Stack<Integer> stack) {
        System.out.println(stack);
        reverseUtil(stack);
        System.out.println(stack);
    }
}
