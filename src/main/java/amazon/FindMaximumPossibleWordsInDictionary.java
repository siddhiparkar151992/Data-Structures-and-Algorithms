package main.java.amazon;

public class FindMaximumPossibleWordsInDictionary {
	Trie trie = new Trie();
	
	public void findCombinations(char[] letters, String str, int start){
		System.out.println(str);
		if(start< letters.length){
			for(int i = start;i<letters.length;i++){
				findCombinations(letters, str+letters[i], i+1);
			}
		}
	}
	public void find(String[] dictionary, char[] letters) {
		
		for (int i = 0; i < dictionary.length; i++) {
			trie.insert(dictionary[i]);
		}
		findCombinations(letters, "", 0);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMaximumPossibleWordsInDictionary f= new FindMaximumPossibleWordsInDictionary();
		f.find(new String[]{"a", "ab", "abc"}, new char[]{'a', 'b', 'c', 'd'});
	}

}
