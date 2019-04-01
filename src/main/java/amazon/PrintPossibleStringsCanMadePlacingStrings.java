package main.java.amazon;

public class PrintPossibleStringsCanMadePlacingStrings {

	boolean isPalindrome(String str, int low, int high) {
		while (low < high) {
			if (str.charAt(low) != str.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}

	public void printUtil(String str, int i, int j, String curr) {

		if (i + 1 < str.length()) {
			curr += " ";
			String temp = curr + str.substring(i + 1);
//			 System.out.println(curr);
			for (int k = i + 1; k < str.length(); k++) {

				printUtil(str, k, str.length(), curr += str.charAt(k));
			}
			System.out.println(curr);
		}

	}

	public void print(String str) {
		String curr = new String();
		char[] arr = new char[2 * curr.length()];
		System.out.println(str);

		for (int i = 0; i < str.length(); i++) {
			curr += String.valueOf(str.charAt(i));
			printUtil(str, i, str.length(), curr);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintPossibleStringsCanMadePlacingStrings p = new PrintPossibleStringsCanMadePlacingStrings();
		p.print("geeks");
	}

}
