package main.java.algorithms.graph;

import java.util.ArrayList;

public class PrintAllNodesAtkDistance {


    // Structure of an edge
    public static class arr {
        public int from, to;

        public arr(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    ;

    // Recursive function to print
// the neighbor nodes of a node
// until K distance
    static void dfs(int k, int node,
                    int parent, ArrayList[] tree) {

        // Base condition
        if (k < 0)
            return;

        // Print the node
        System.out.print(node + " ");

        ArrayList tmp = (ArrayList) tree[node];

        // Traverse the connected
        // nodes/adjacency list
        for (int i : (ArrayList<Integer>) tmp) {
            if (i != parent) {

                // Node i becomes the parent
                // of its child node
                dfs(k - 1, i, node, tree);
            }
        }
    }

    // Function to print nodes under
// distance k
    static void print_under_dis_K(arr[] graph,
                                  int node, int k,
                                  int v, int e) {

        // To make graph with
        // the given edges
        ArrayList[] tree = new ArrayList[v + 1];

        for (int i = 0; i < v + 1; i++) {
            tree[i] = new ArrayList();
        }

        for (int i = 0; i < e; i++) {

            int from = graph[i].from;
            int to = graph[i].to;

            tree[from].add(to);
            tree[to].add(from);
        }

        dfs(k, node, -1, tree);
    }

    // Driver Code
    public static void main(String[] args) {

        // Number of vertex and edges
        int v = 7, e = 6;

        // Given edges
        arr[] graph = {new arr(2, 1),
                new arr(2, 5),
                new arr(5, 4),
                new arr(5, 7),
                new arr(4, 3),
                new arr(7, 6)};

        // k is the required distance
        // upto which are neighbor
        // nodes should get printed
        int node = 4, k = 2;

        // Function calling
        print_under_dis_K(graph, node, k, v, e);
    }

}
