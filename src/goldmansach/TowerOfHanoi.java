package goldmansach;

import java.util.Stack;

public class TowerOfHanoi {

	public static void move(Stack<Integer> source, Stack<Integer> dest, char s, char d) {
		int s1 = source.pop();
		int s2 = dest.pop();

		if (s1 == -1) {
			source.push(s2);
			System.out.println("moved disk from " + d + " to " + s);
		} else if (s2 == -1) {
			dest.push(s2 = 1);
			System.out.println("moved disk from " + s + " to " + d);
		} else if (s1 > s2) {
			source.push(s2);
			System.out.println("moved disk from " + d + " to " + s);
		} else {
			dest.push(s1);
			System.out.println("moved disk from " + d + " to " + s);
		}
	}

	public static void towerOfHanoi(int n, Stack<Integer> source, Stack<Integer> aux, Stack<Integer> dest) {
		int t = (int) Math.pow(2, n) - 1;
		char s = 's', a = 'a', d = 'd';

		if (n % 2 == 0) {
			Stack<Integer> temp = source;
			source = dest;
			dest = temp;
		}

		for (int i = 1; i < t; i++) {
			if (i % 3 == 0) {
				move(aux, dest, a, d);
			} else if (i % 3 == 1) {
				move(source, dest, s, d);
			} else if (i % 3 == 2) {
				move(source, aux, s, a);
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
