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
		// TODO Auto-generated method stub

	}

}
