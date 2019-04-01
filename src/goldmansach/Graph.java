package goldmansach;

import java.util.*;

/**
 * Created by Siddhi Parkar on 25-11-2017.
 */
public class Graph {
    public Map<String, List<String>> graph = new HashMap<>();

    public void addEdge(String a1, String a2) {
        List<String> adj = graph.get(a1);
        if(adj==null){
            adj = new ArrayList<>();
        }
        adj.add(a2);
        graph.put(a1, adj);
    }

    public void topologicalSortUtil(Stack<String> stack, Map<String, Boolean> visited, String key,List<String> adj ){
        visited.put(key, true);
        if(adj != null ) {
            for(String a: adj) {
                if(visited.get(a)==null || !visited.get(a)){
                    topologicalSortUtil(stack, visited, a, graph.get(a));
                }
            }
        }

        stack.push(key);
    }
    public void topologicalSort(){
        Stack<String> stack = new Stack<>();
        Iterator<Map.Entry<String, List<String>>> it = graph.entrySet().iterator();
        Map<String, Boolean> visited = new HashMap<>();
        while (it.hasNext()){
            Map.Entry<String, List<String>> entry = it.next();
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if(visited.get(key)==null || !visited.get(key)) {
                topologicalSortUtil(stack, visited, key, value);
            }
        }
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge("t", "a");
        graph.addEdge("t", "b");
        graph.addEdge("t", "c");
        graph.addEdge("a", "m");
        graph.addEdge("a", "n");
        graph.addEdge("n", "k");
        graph.topologicalSort();
    }
}
