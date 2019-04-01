package main.java.amazon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trie {
	private Map<Character, Object> children=  new HashMap<Character, Object>();
	private boolean isEnd;

	public void insert(String data) {
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
	}

	public void searchrecur(Map<Character, Object> resultStr, String out) {
		if(resultStr.get('#')!=null){
			System.out.println(out);
			
		}
		for (Map.Entry<Character, Object> entry : (resultStr).entrySet()) {
			if(entry.getValue()=="end") continue;
			Map<Character, Object> v = (Map<Character, Object>) entry.getValue();
			Character c = entry.getKey();
			
			searchrecur((Map<Character, Object>) entry.getValue(), out.concat(c.toString()));

		}
	}

	public boolean search(String input) {
		
		Map<Character, Object> resultStr = children;
		for (int i = 0; i < input.length(); i++) {
			if (resultStr.get(input.charAt(i)) != null) {
				resultStr = (Map<Character, Object>) resultStr.get(input.charAt(i));
			} else {
				System.out.println("No suggestion found");
				return false;
			}

		}
		searchrecur(resultStr, input);
		return true;
	}

	public static void main(String[] args) {
		Trie t = new Trie();
		
		t.insert("hell");
		t.insert("cat");
		t.insert("a");
		t.insert("hel");
		t.insert("help");
		t.insert("helps");
		t.insert("helping");
		System.out.println(t);
		t.search("he");
		
//		t.insert("gforgeeks");
//		t.insert("geeksquiz");
//		t.search("ge");
//		t.search("gekk");
	}

}