package main.java.amazon;

public class PrimsMinimumTree {

	public int min(boolean[] visited, int[] key) {
		int min = Integer.MAX_VALUE;
		int minIndex = -9999;
		for (int i = 0; i < key.length; i++) {
			if(visited[i] == false && key[i] < min){
				min = key[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	public void findMinSpanningTree(int[][] arr, int n) {
		int[] result = new int[n];
		int[] key = new int[n];
		boolean[] visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			key[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
		key[0] = 0;
		result[0] = -1;
		for (int count = 0; count < n; count++) {
			int u = min(visited, key);
			visited[u] = true;
			for(int v=0;v<n;v++){
				if(arr[u][v] !=0 && !visited[v] && key[v] > arr[u][v] ){
					result[v] = u;
					key[v] =  arr[u][v];
				}
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimsMinimumTree p = new PrimsMinimumTree();
		p.findMinSpanningTree(new int[][] {{0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0},
           }, 5);
	}

}
