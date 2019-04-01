package main.java.amazon;

import java.util.HashMap;
import java.util.Map;

import main.java.algorithms.arrays.heap.MinHeap;

public class FindKMostFrequentWords {
	public class Result {
		boolean found = false;
		Map<Character, Integer> map = new HashMap<>();
	}

	public class Trie {
		private Map<Character, Object> children = new HashMap<Character, Object>();
		private boolean isEnd;

		public void insert(String data, Character key, int value) {
			Map<Character, Object> current = children;
			for (int i = 0; i < data.length(); i++) {

				Character letter = data.charAt(i);
				if (current.get(letter) != null) {
					current = (Map<Character, Object>) current.get(letter);
				} else {
					current.put(letter, new HashMap<>());
					current = (Map<Character, Object>) current.get(letter);
				}

			}
			current.put('#', "end");
			current.put(key, value);
		}

		public void searchrecur(Map<Character, Object> resultStr, String out, Result r) {
			if (resultStr.get('#') != null) {
				r.found = true;
				r.map.put('c', (Integer) resultStr.get('c'));
			}
			for (Map.Entry<Character, Object> entry : (resultStr).entrySet()) {
				if (entry.getValue() == "end")
					continue;
				Map<Character, Object> v = (Map<Character, Object>) entry.getValue();
				Character c = entry.getKey();

				searchrecur((Map<Character, Object>) entry.getValue(), out.concat(c.toString()), r);

			}
			out = "";
		}

		public boolean search(String input, Result r) {

			Map<Character, Object> resultStr = children;
			for (int i = 0; i < input.length(); i++) {
				if (resultStr.get(input.charAt(i)) != null) {
					resultStr = (Map<Character, Object>) resultStr.get(input.charAt(i));
				} else {
					System.out.println("No suggestion found");
					return false;
				}

			}

			searchrecur(resultStr, input, r);
			return true;
		}
	}

	Trie t = new Trie();
	Result r = new Result();
	MinHeap heap = new MinHeap();

	int hcount = 0;

	public void find(String[] arr, int k) {
		int[] heapArr = new int[k];
		for (int i = 0; i < arr.length; i++) {
			t.search(arr[i], r);
			if (r.found) {
				t.insert(arr[i], 'c', r.map.get('c') + 1);
			} else if(hcount == k){
//				t.search(input, r);
			}
			r.found = false;
//			r.map = new HashMap<>()
		}
	}

	public static void main(String[] args) {

	}

}
