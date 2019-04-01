package bloomberg;

import java.util.ArrayList;
import java.util.List;

public class CopyConstructorForGraph {
	public class Graph implements Cloneable{ 
		List<Node> vertices;
		
		public Graph(Graph graph) {
			this.vertices = new ArrayList<>(vertices);
		}
		@Override
		protected Graph clone() throws CloneNotSupportedException {
			return new Graph(this);
		}
		
	}
	public class Node {
		String name;
		List<Edge> edges;
		
		public Node(Node node) {
			this.name = node.name;
			this.edges = new ArrayList<>(edges);
		}
		@Override
		protected Node clone() throws CloneNotSupportedException {
			return new Node(this);
		}
	}
	
	public class Edge {
		Node start;
		Node end;
		int weight;
		
		public Edge(Edge  edge) {
			try {
				this.start = edge.start.clone();
				this.end = edge.end.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.weight = edge.weight;
			
		}
		@Override
		protected Edge clone() throws CloneNotSupportedException{
			return new Edge(this);
		}
	}
	
	
}
