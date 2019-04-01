package main.java.algorithms.graph;

public class FindACycleInGraph {
	
	public boolean isCyclicUtil(Graph graph, boolean[] visited,boolean[] recStack, int v){
		visited[v] = true;
		recStack[v] = true;
		
		for(int i=0;i<graph.adj[v].size();i++){
			if(!visited[graph.adj[v].get(i)]){
				if(isCyclicUtil(graph, visited, recStack, graph.adj[v].get(i)) == true){
					return true;
				}
			}else if(recStack[graph.adj[v].get(i)] == true){
				return true;
			}
		}
		
		recStack[v] = false;
		return false;
	}
	
	public boolean cyclic(Graph graph){
		boolean[] recStack= new boolean[graph.noOfVertices];
		boolean[] visited= new boolean[graph.noOfVertices];
		
		for(int i=0;i<graph.noOfVertices;i++){
			if(isCyclicUtil(graph, visited, recStack, i)){
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		FindACycleInGraph f= new FindACycleInGraph();
		f.cyclic(g);

	}

}
