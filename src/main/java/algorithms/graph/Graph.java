package main.java.algorithms.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Graph {
	public int noOfVertices;
	public LinkedList<Integer>[] adj;

	public Graph(int noOfVertices) {
		super();
		this.noOfVertices = noOfVertices;
		adj = new LinkedList[noOfVertices];
		for(int i=0;i<noOfVertices;i++){
			adj[i] =  new LinkedList<>();
		}
	}
	
	public void addEdge(int from, int to){
		adj[from].add(to);
	}
	
	public void BFS(int start){
		LinkedList<Integer> queue = new LinkedList<Integer>();
		 boolean[] visited = new boolean[noOfVertices];
		 
		 queue.add(start);
		 visited[start] = true;
		 while(!queue.isEmpty()){
			 start = queue.poll();
			 System.out.println(start);
			 Iterator<Integer> it = adj[start].listIterator();
			 
			 
			 while(it.hasNext()){
				 Integer next = it.next();
				 if(!visited[next]){
					 visited[next] = true;
					 queue.push(next);
				 }
			 }
		 }
		 
		 
	}
	public static void main(String[] args){
		 Graph g = new Graph(4);
		 
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	 
	        g.BFS(2);
	}
	
}
