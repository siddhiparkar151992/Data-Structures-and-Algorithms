package main.java.amazon;

import java.util.HashMap;
import java.util.Map;

public class WordBreakProblems {

	public void wordBreakUtil(Map<String, Integer> dict, String str, int i, String currStr) {

		if (dict.get(currStr) != null) {
			System.out.println(currStr);
		}
		if (i + 1 < str.length()) {
			for (int j = i + 1; j < str.length(); j++) {
				currStr += str.charAt(j);
				wordBreakUtil(dict, str, j, currStr);
			}
		}
	}

	public void wordBreak(Map<String, Integer> dict, String str) {
		 if(dict.get(str.charAt(0))!=null){
		 System.out.println(str.charAt(0));
		 }
		 for(int i=0;i<str.length();i++){
		 wordBreakUtil(dict, str, i, str.charAt(i)+"");
		 }
		boolean[] wb = new boolean[str.length() + 1];
		for (int i = 1; i <= str.length(); i++) {
			if (wb[i] == false && dict.containsKey(str.substring(0, i))) {
				wb[i] = true;
			}
			if (wb[i] == true) {
				if (i == str.length()) {
					System.out.println("");
					return;
				}
				
				for(int j= i+1;j<=str.length();j++){
					if (wb[j] == false && dict.containsKey(str.substring(i, j-i))) {
						wb[j] = true;
					}
					if (j == str.length() && wb[j] == true)
	                    return;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordBreakProblems w = new WordBreakProblems();
		Map<String, Integer> map = new HashMap<>();
		map.put("i", 0);
		map.put("like", 0);
		map.put("sam", 0);
		map.put("sung", 0);
		map.put("samsung", 0);
		map.put("mobile", 0);
		map.put("ice", 0);
		map.put("cream", 0);
		map.put("icecream", 0);
		map.put("man", 0);
		map.put("go", 0);
		map.put("mango", 0);
		w.wordBreak(map, "ilikesamsung");
	}

}
