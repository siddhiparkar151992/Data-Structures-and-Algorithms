package goldmansach;

import java.util.Stack;

public class StackToGetMin {

	Stack<Integer> stack = new Stack<>();

	public void insert(int elem) {
		if (stack.isEmpty()) {
			stack.push(elem);
			return;
		}
		sortedInsert(elem);
	}

	private void sortedInsert(int elem) {
		int n = -1;
		if (!stack.isEmpty()) {
			n = stack.peek();
			if (elem < n) {
				stack.push(elem);
				return;
			} else {
				stack.pop();
				sortedInsert(elem);
			}
		}
		if (n != -1) {
			stack.push(n);
		}
	}

	public void top() {
		System.out.println(stack.pop());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackToGetMin stack = new StackToGetMin();
		stack.insert(5);
		stack.insert(2);
		stack.insert(10);
		stack.insert(7);
		stack.insert(1);

		stack.top();
		stack.top();
		stack.top();
	}

}
