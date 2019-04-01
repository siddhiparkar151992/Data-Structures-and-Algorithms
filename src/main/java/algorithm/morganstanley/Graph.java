package main.java.algorithm.morganstanley;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Graph {
	Map<String, List<String>> graph = new HashMap<>();
	int noOfVertices;

	public Graph(int noOfVertices) {
		this.noOfVertices = noOfVertices;
	}

	public void addEdge(String from, String to) {
		List<String> adj = graph.get(from);
		if (adj == null) {
			adj = new ArrayList<String>();
		}
		adj.add(to);
		graph.put(from, adj);
	}

	private void topologicalSort(Stack<String> stack, Map<String, Boolean> visited, List<String> adj, String current) {
		visited.put(current, true);

		if (adj != null) {
			for (String a : adj) {
				if (visited.get(a) == null || !visited.get(a)) {
					topologicalSort(stack, visited, graph.get(a), a);
				}
			}
		}
		stack.push(current);
	}

	public void topologicalSort() {
		Map<String, Boolean> visited = new HashMap<>();
		Iterator i = graph.entrySet().iterator();
		Stack<String> stack = new Stack<>();
		while (i.hasNext()) {
			Map.Entry e = (Map.Entry) i.next();
			String key = (String) e.getKey();
			List<String> l = (List<String>) e.getValue();
			if (visited.get(key) == null || !visited.get(key)) {
				topologicalSort(stack, visited, l, key);
			}

		}
		while (stack.empty() == false)
			System.out.print(stack.pop() + " ");

	}

	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.addEdge("Ajay", "Ramesh");
		g.addEdge("Deepesh", "Animesh");
		g.addEdge("Mohan", "Ajay");
		g.addEdge("Rahul", "Mohan");
		g.topologicalSort();
	}
}
