package main.java.algorithm.morganstanley;

public class Dijkstra {

	public void dijkstra(int[][] graph, int n) {
		int[] dist = new int[n];
		boolean[] sptSet = new boolean[n];

		for (int i = 0; i < n; i++) {
			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}
		dist[0] = 0;

		for (int i = 0; i < n; i++) {
			int min = getMinDist(dist, sptSet);
			sptSet[min] = true;
			for (int j = 0; j < n; j++) {
				dist[j] = graph[min][j];
				if(!sptSet[j] && graph[min][j]!=0 && dist[min]!=Integer.MAX_VALUE && 
						dist[j]+ graph[min][j] < dist[j]){
					dist[j] = dist[j]+ graph[min][j]; 
				}
			}
		}
	}

	private int getMinDist(int[] dist, boolean[] sptSet) {
		int min = 0;
		for (int i = 0; i < dist.length; i++) {
			if (dist[i] < dist[min] && !sptSet[i]) {
				min = i;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int graph[][]
				= new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
				{ 4, 0, 8, 0, 0, 0, 0, 11, 0 },
				{ 0, 8, 0, 7, 0, 4, 0, 0, 2 },
				{ 0, 0, 7, 0, 9, 14, 0, 0, 0 },
				{ 0, 0, 0, 9, 0, 10, 0, 0, 0 },
				{ 0, 0, 4, 14, 10, 0, 2, 0, 0 },
				{ 0, 0, 0, 0, 0, 2, 0, 1, 6 },
				{ 8, 11, 0, 0, 0, 0, 1, 0, 7 },
				{ 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
		Dijkstra t = new Dijkstra();

		// Function call
		t.dijkstra(graph, 9);
	}

}
