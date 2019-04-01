package main.java.amazon;

import main.java.algorithms.graph.Graph;
import main.java.algorithms.graph.TopologicalSorting;

public class FindPrecedenceIAlienDictionary {

	public void find(String[] arr) {
		TopologicalSorting t = new TopologicalSorting();
		Graph g= new Graph(3);
		for (int i = 0; i < arr.length-1; i++) {
			String w1= arr[i];
			String w2 = arr[i+1];
			for(int j=0;j<Math.min(w1.length(),w2.length());j++){
				if(w1.charAt(j)!=w2.charAt(j)){
					g.addEdge(w1.charAt(j) - 'a', w2.charAt(j)- 'a');
					break;
				}
			}
		}
		t.topologicalSort(g);
		System.out.println(t);
	}

	public static void main(String[] args) {
		String words[] = {"caa", "aaa", "aab"};
		FindPrecedenceIAlienDictionary f= new FindPrecedenceIAlienDictionary();
		f.find(words);

	}

}
