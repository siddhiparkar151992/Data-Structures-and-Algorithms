package bloomberg;

import java.util.Stack;

public class NextGreaterElement {

	public static void find(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);
		int i = 1;
		while (i < arr.length) {

			if (!stack.isEmpty()) {
				int elem = stack.pop();
				while (elem < arr[i]) {
					System.out.println(elem + " "+ arr[i]);
					if (stack.isEmpty())
						break;
					elem = stack.pop();
				}

				if (elem > arr[i]) {
					stack.add(elem);
				}
			}
			stack.push(arr[i]);
			i++;
		}
		while (!stack.isEmpty()) {
			int elem = stack.pop();
			System.out.println(elem +" "+-1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find(new int[] { 13, 7, 6, 12 });
	}

}
