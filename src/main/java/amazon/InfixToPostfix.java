package main.java.amazon;

import java.util.Stack;

import main.java.amazon.FindKthLargestElementInBST.Result;

public class InfixToPostfix {
	int Prec(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
			return 2;

		case '^':
			return 3;
		}
		return -1;
	}

	public void infixToPostFix(String str) {
		Stack<Character> stack = new Stack<>();
		String reString = "";
		int i = 0;
		while (i < str.length()) {
			char c = str.charAt(i);
			if (Character.isLetter(c)) {
				reString += c;
			} else if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					reString += stack.pop();
				}
				if (!stack.isEmpty() && stack.peek() != '(')
					System.out.println("invalid"); // invalid expression
				else
					stack.pop();
			} else {
				while (!stack.isEmpty() && Prec(stack.peek()) >= Prec(c)) {
					reString += stack.pop();
				}
				stack.push(c);
			}
			i++;
		}
		while (!stack.isEmpty()) {
			reString += stack.pop();
		}
		System.out.println(reString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfixToPostfix i = new InfixToPostfix();
		i.infixToPostFix("a+b*(c^d-e)^(f+g*h)-i");
	}

}
