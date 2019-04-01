package main.java.amazon;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinimumSpanningKruskal {

	public class Node {
		int src;
		int dest;
		int weight;

	}

	public class NodeSorter implements Comparator<Node> {

		@Override
		public int compare(Node o1, Node o2) {
			if (o1.weight < o2.weight)
				return 1;
			return 0;
		}

	}

	public void minSpanningTree(List<Node> list) {
		Collections.sort(list, new NodeSorter());
		System.out.println(list);
		
		boolean[] visited = new boolean[99999999];
		
		while (true) {
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
