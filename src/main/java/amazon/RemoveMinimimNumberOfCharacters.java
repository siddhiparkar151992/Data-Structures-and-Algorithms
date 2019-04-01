package main.java.amazon;

public class RemoveMinimimNumberOfCharacters {

	public int anagram(String str1, String str2) {
		int count1[] = new int[str1.length()];
		int count2[] = new int[str2.length()];

		for (int i = 0; i < str1.length(); i++) {
			count1[str1.charAt(i) - 'a']++;
		}

		for (int i = 0; i < str2.length(); i++) {
			count2[str2.charAt(i) - 'a']++;
		}

		int r = 0;
		for (int i = 0; i < 26; i++) {
			r+=Math.abs(count1[i] - count2[i]);
		}
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
