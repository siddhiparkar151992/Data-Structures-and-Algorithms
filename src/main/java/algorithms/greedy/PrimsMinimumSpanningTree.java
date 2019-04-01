package main.java.algorithms.greedy;

public class PrimsMinimumSpanningTree {

	public int minKey(int[] key, boolean[] mst) {
		int min = Integer.MAX_VALUE;
		for (int j = 0; j < key.length; j++) {
			if (!mst[j] && key[j] < min) {
				min = key[j];
			}
		}
		return min;
	}

	void printMST(int parent[], int n, int graph[][]) {
		System.out.println("Edge   Weight");
		for (int i = 1; i < graph.length; i++)
			System.out.println(parent[i] + " - " + i + "    " + graph[i][parent[i]]);
	}

	public void primMST(int[][] graph) {
		int V = graph.length;
		int[] parent = new int[V];
		boolean[] mstSet = new boolean[V];
		int[] key = new int[V];

		for (int j = 0; j < V; j++) {
			key[j] = Integer.MAX_VALUE;
			mstSet[j] = false;
		}

		key[0] = 0;
		parent[0] = -1;

		for (int i = 0; i < V; i++) {
			int u = minKey(key, mstSet);
			mstSet[u] = true;
			for (int j = 0; j < V; j++) {
				if (graph[u][j] != 0 && mstSet[j] == false && graph[u][j] < key[j]) {
					parent[j] = u;
					key[j] = graph[u][j];
				}
			}

		}
		
		printMST(parent, V, graph);

	}

	public static void main(String[] args) {
		int graph[][] = new int[][] { { 0, 2, 0, 6, 0 }, { 2, 0, 3, 8, 5 }, { 0, 3, 0, 0, 7 }, { 6, 8, 0, 0, 9 },
				{ 0, 5, 7, 9, 0 }, };
		PrimsMinimumSpanningTree p = new PrimsMinimumSpanningTree();
		// Print the solution
		p.primMST(graph);
	}

}
