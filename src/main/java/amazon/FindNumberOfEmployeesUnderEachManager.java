package main.java.amazon;

import main.java.algorithms.graph.Graph;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindNumberOfEmployeesUnderEachManager {
	
	public class Result {
		int n = 0;
	}
	Result r= new Result();
	Map<Integer, Integer> map = new HashMap<>();
	public int DFS(Graph g, int i, boolean[] visited, int count) {
		visited[i] = true;
		
		Iterator<Integer> it = g.adj[i].listIterator();
		while(it.hasNext()){
			int c = it.next();
			if(!visited[c] && c!=i){
				
				count= DFS(g, c, visited, count);
			}
		}
		count+=1;
		return count;
	}

	public void findNumberOfEmployees(Graph g, int k) {
		boolean[] visited = new boolean[k];
		for (int i = 0; i < k; i++) {
			if(!visited[i]){
				DFS(g,i, visited, 0);
				
//				r.n = 0;
			}
//			System.out.println(i+" "+r.n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(6);
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,5);
		g.addEdge(3,4);
		g.addEdge(4,5);
		g.addEdge(5,5);
		FindNumberOfEmployeesUnderEachManager f= new FindNumberOfEmployeesUnderEachManager();
		f.findNumberOfEmployees(g, 6);
	}

}
