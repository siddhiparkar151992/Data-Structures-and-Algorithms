package main.java.amazon;

import java.util.LinkedList;
import java.util.Queue;

public class WordLadder {
	public class Node {
		String str;
		int chain;
	}

	public boolean isAdjacent(String str, String curr) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != curr.charAt(i)) {
				count++;
			}
		}
		return count == 1;
	}

	public void wordLadder(String[] list, String start, String end) {
		Queue<Node> queue = new LinkedList<>();
		Node c = new Node();
		c.chain = 1;
		c.str = start;
		queue.add(c);
		while (!queue.isEmpty()) {
			Node curr = queue.poll();
			for (int i = 0; i < list.length; i++) {
				if(isAdjacent(list[i], curr.str)){
					Node node = new Node();
					node.str = list[i];
					node.chain = curr.chain+1;
					queue.add(node);
				}
				if(curr.str == end) {
					System.out.println(curr.chain);
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
