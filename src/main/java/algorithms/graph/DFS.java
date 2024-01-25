package main.java.algorithms.graph;

import java.util.Iterator;

public class DFS {

	public void dfeGraph(Graph graph, int start) {
		boolean[] visited = new boolean[graph.V];
		for(int i=0;i<graph.V;i++){
			dfs(graph, i, visited);
		}

	}

	public void dfs(Graph graph, int start, boolean[] visited) {
		System.out.println(start);
		visited[start] = true;
		Iterator<Integer> it = graph.adj[start].listIterator();
		while (it.hasNext()) {

			int next = it.next();
			if (!visited[next]) {
				dfs(graph, next, visited);
			}

		}
	}

	public static void main(String[] args) {
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		DFS d = new DFS();
		d.dfeGraph(g, 2);
	}

}
