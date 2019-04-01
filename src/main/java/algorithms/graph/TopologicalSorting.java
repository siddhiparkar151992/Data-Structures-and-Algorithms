package main.java.algorithms.graph;

import java.util.Iterator;
import java.util.Stack;

public class TopologicalSorting {

	public void topologicalUtil(Graph g, boolean[] visited, int v, Stack stack) {
		visited[v] = true;
		int i;
		Iterator<Integer> it = g.adj[v].iterator();
		while (it.hasNext()) {
			i = it.next();
			if (!visited[i]) {
				topologicalUtil(g, visited, i, stack);
			}
		}
		stack.push(new Integer(v));
	}

	public void topologicalSort(Graph graph) {
		boolean[] visited = new boolean[graph.noOfVertices];

		Stack stack = new Stack();
		for (int i = 0; i < visited.length; i++) {
			visited[i] = false;

		}
		for (int j = 0; j < graph.noOfVertices; j++) {
			if(!visited[j])
			topologicalUtil(graph, visited, j, stack);
		}
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
	}

	public static void main(String[] args) {
		Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        
        TopologicalSorting t = new TopologicalSorting();
        t.topologicalSort(g);

	}

}
