package main.java.algorithms.arrays;

import java.util.Stack;

/**
 * Created by Siddhi Parkar on 10-02-2018.
 */
public class NextGreaterElement {
    static void find(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            if (!stack.empty()) {
              int elem = stack.pop();
              if(current > elem) {
                  System.out.println(current);
                  while(!stack.isEmpty() && stack.peek() < current){
                      stack.pop();
                      System.out.println(current);
                  }
              }else{
                  stack.push(elem);
              }
            }
            stack.push(current);
        }
    }

    public static void main(String[] args) {
        find(new int[] {1,4,3,2,5,4,3,7});
    }
}
