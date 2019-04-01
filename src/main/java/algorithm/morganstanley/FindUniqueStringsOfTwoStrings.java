package main.java.algorithm.morganstanley;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueStringsOfTwoStrings {

	public static int getMaxUniqueStrings(String str1, String str2) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < str1.length(); i++) {
			for (int j = i; j < str2.length(); j++) {
					

					String temp = str1.substring(i, j + 1);

					String remained = str2.substring(j+1);
					map.put(str2.substring(0, i)+temp + remained, -1);
					
					temp = str2.substring(i, j + 1);

					remained = str1.substring(j+1);
					map.put(str1.substring(0, i) + temp + remained, -1);
				

			}
		}
		return map.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMaxUniqueStrings("abc", "xyz"));
	}

}
