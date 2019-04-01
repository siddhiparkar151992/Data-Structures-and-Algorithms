package main.java.amazon;

public class CountSubstringWithSameFirstAndLastCharacters {

	public static int count(String str) {
		int r = 0;
		int[] count = new int[26];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)- 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			r+=count[i]*((count[i]+1)/2);
		}
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(count("aba"));
	}

}
