package main.java.algorithms.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StronglylConnectedComponents {

    public boolean dfs(Graph g, int i, int j, int v, int[] visited) {
        if (i == j) {
            return true;
        }

        visited[i] = 1;
        LinkedList<Integer> adjecent = g.adj[i];
        Iterator<Integer> it = adjecent.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (visited[next] == 0 && dfs(g, j, next, v, visited)) {
                return true;
            }
        }
        return true;
    }

    public boolean isPath(Graph g, int i, int j, int v) {
        int[] visited = new int[v+1];
        return dfs(g, i, j, v+1, visited);
    }

    public void StronglyConnectedComponents(Graph g, int V) {
        List<List<Integer>> scc = new ArrayList<>();

        int[] visited = new int[V + 1];
        boolean[][] path = new boolean[V+1][V+1];
        for (int i = 1; i <= V; i++) {
            List<Integer> sccByV = new ArrayList<>();

            if (visited[i] == 0) {

                sccByV.add(i);
                for (int j = i + 1; j <= V; j++) {

                    boolean sourceToDest;
                    if (path[i][j]) {
                        sourceToDest = true;
                    } else {
                        sourceToDest = isPath(g, i, j, V);
                    }

                    boolean destToSource;
                    if (path[j][i]) {
                        destToSource = true;
                    } else {
                        destToSource = isPath(g, j, i, V);
                    }
                    if (visited[j] == 0 &&  sourceToDest && destToSource) {

                        visited[j] = 1;
                        sccByV.add(j);
                    }
                }
            }

            scc.add(sccByV);
        }

        System.out.println(scc);
    }

    public static void main(String... args) {
        Graph g = new Graph(6);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 1);
        g.addEdge(3, 2);
        g.addEdge(4, 5);

        var s = new StronglylConnectedComponents();
        s.StronglyConnectedComponents(g, 5);

    }
}
