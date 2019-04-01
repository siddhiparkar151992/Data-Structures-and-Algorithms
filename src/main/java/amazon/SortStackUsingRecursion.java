package main.java.amazon;

import java.util.ListIterator;
import java.util.Stack;

public class SortStackUsingRecursion {

	public void insert(Stack<Integer> stack, int element) {
		if (stack.empty() || element > stack.peek()) {
			stack.push(element);
			return;

		}
		int temp = stack.pop();
		insert(stack, element);
		stack.push(temp);

	}

	public void sortStack(Stack<Integer> stack) {
		if (!stack.isEmpty()) {
			int temp = stack.pop();
			sortStack(stack);
			insert(stack, temp);
		}
	}

	public void sort(Stack<Integer> stack) {
		sortStack(stack);
//		System.out.println(stack);
	}
	static void printStack(Stack<Integer> s)
    {
       ListIterator<Integer> lt = s.listIterator();
        
       // forwarding
       while(lt.hasNext())
           lt.next();
        
       // printing from top to bottom
       while(lt.hasPrevious())
           System.out.print(lt.previous()+" ");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortStackUsingRecursion si= new SortStackUsingRecursion();
		Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);
      
        si.sort(s);
        printStack(s);
	}

}
