package main.java.algorithms.arrays.heap;

import java.util.HashMap;
import java.util.Map;

public class FindKMOstFrequentWordInFile {

	public class Trie {
		public Map<Character, Object> children;
		
		public void Trie() {
			children =new HashMap<>();
		}
		public void insert(String str) {
			Map<Character, Object> current = children;
			for (Character chr : str.toCharArray()) {
				if (children.get(chr) != null) {
					children = (HashMap<Character, Object>) children.get(chr);
				} else {
					Map<Character, Object> map = new HashMap<>();
					children.put(chr, map);
				}
			}
			current.put('#', "end");
		}
		
		public void search(String str) {
			Map<Character, Object> current = children;
			for (Character chr : str.toCharArray()) {
				if (children.get(chr) != null) {
					children = (HashMap<Character, Object>) children.get(chr);
				} else {
					System.out.println("not found");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
