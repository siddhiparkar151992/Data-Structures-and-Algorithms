package main.java.amazon;

import java.util.HashMap;
import java.util.Map;

public class TriePhoneDirectory {

	Map<Character, Object> trie = new HashMap<>();

	public void insert(String word) {

		Map<Character, Object> current = trie;
		for (int i = 0; i < word.length(); i++) {
			Character c = word.charAt(i);
			if (current.get(c) == null) {

				Map<Character, Object> node = new HashMap<>();
				current.put(c, node);
			}
			current = (Map<Character, Object>) current.get(c);
		}
		current.put('#', "end");
	}

	public Map<Character, Object> search(String word) {
		Map<Character, Object> current = trie;
		for (int i = 0; i < word.length(); i++) {
			Character c = word.charAt(i);
			if (current.get(c) == null) {
				System.out.println("No suggestion found");
				return null;
			} else {
				current = (Map<Character, Object>) current.get(c);
			}
		}
		searchRecur(current, word);
		return current;
	}

	public void searchRecur(Map<Character, Object> current, String word) {

		if (current.get('#') == "end") {
			System.out.println(word);
		}
		for (Map.Entry<Character, Object> entry : (current).entrySet()) {
			if (entry.getKey() == '#')
				continue;
			Character c = entry.getKey();
			Map<Character, Object> v = (Map<Character, Object>) entry.getValue();
			searchRecur(v, word.concat(c.toString()));
		}

	}

	public void phoneDirUtil(Map<Character, Object> node, String word) {

	}

	public void phoneDirectory(String word) {
		Map<Character, Object> currentNode = trie;
		String currentPrefix= "";
		for (int i = 0; i < word.length(); i++) {
			currentPrefix+=word.charAt(i);
			if(currentNode.get(word.charAt(i))!=null){
				System.out.println("serach for "+currentPrefix);
				search(currentPrefix);
				currentNode = (Map<Character, Object>) currentNode.get(word.charAt(i));
			}else{
				System.out.println("no suggestion found for "+currentPrefix);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriePhoneDirectory t = new TriePhoneDirectory();
		t.insert("gforgeeks");
		t.insert("geeksquiz");
		t.phoneDirectory("geks");

	}

}
