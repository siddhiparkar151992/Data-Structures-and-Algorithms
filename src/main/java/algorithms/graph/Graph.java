package main.java.algorithms.graph;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Graph {

    public int V;
    public LinkedList<Integer> adj[];

    public Graph(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }


    public void addEdge(int i, int j) {
        adj[i].add(j);
    }

    public void BFS(int k) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue
                = new LinkedList<Integer>();

        queue.add(k);
        visited[k] = true;
        Iterator<Integer> it = queue.iterator();
        while (it.hasNext()) {
            int n = it.next();
            System.out.print(n + " ");
            ListIterator<Integer> adjLi = adj[n].listIterator();
            while (adjLi.hasNext()) {
                int g= adjLi.next();
                if (!visited[g]) {
                    visited[g] = true;
                    queue.add(g);
                }
            }

        }

        Iterator<Integer> qit = queue.iterator();
        while (qit.hasNext()) {
            System.out.println(qit.next());
        }

    }

    public static void main(String... args) {
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
