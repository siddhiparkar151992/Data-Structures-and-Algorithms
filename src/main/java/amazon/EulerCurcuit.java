package main.java.amazon;

import java.util.Iterator;

import main.java.algorithms.graph.Graph;

public class EulerCurcuit {

	Graph graph = new Graph(6);
	int[] in = new int[6];

	public void DFS(boolean[] visited, int v) {
		visited[v] = true;

		Iterator<Integer> i = graph.adj[v].iterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n]) {
				DFS(visited, n);
			}
		}
	}

	Graph getTranspose() {
		Graph g = new Graph(graph.noOfVertices);
		for (int v = 0; v < graph.noOfVertices; v++) {
			// Recur for all the vertices adjacent to this vertex
			Iterator<Integer> i = graph.adj[v].listIterator();
			while (i.hasNext()) {
				g.adj[i.next()].add(v);
				(in[v])++;
			}
		}
		return g;
	}

	public boolean isSC() {
		boolean[] visited = new boolean[graph.noOfVertices];
		for (int i = 0; i < graph.noOfVertices; i++) {
			visited[i] = false;
		}
		DFS(visited, 0);
		for (int i = 0; i < graph.noOfVertices; i++)
			if (visited[i] == false)
				return false;
		Graph gr = getTranspose();
		graph = gr;
		DFS(visited, 0);
		for (int i = 0; i < graph.noOfVertices; i++)
			if (visited[i] == false)
				return false;
		return true;

	}

	Boolean isEulerianCycle() {
		if (isSC() == false)
			return false;

		for (int i = 0; i < graph.noOfVertices; i++)
			if (graph.adj[i].size() != in[i])
				return false;

		return true;
	}

	public static void main(String[] args) {
		EulerCurcuit e = new EulerCurcuit();
		Graph g = new Graph(5);
		g.addEdge(1, 0);
		g.addEdge(0, 2);
		g.addEdge(2, 1);
		g.addEdge(0, 3);
		g.addEdge(3, 4);
		g.addEdge(4, 0);

		if (e.isEulerianCycle())
			System.out.println("Given directed graph is eulerian ");
		else
			System.out.println("Given directed graph is NOT eulerian ");
	}

}
