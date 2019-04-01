package goldmansach;

public class NumberOfFlipsToMakeBinaryStringAlternate {

	public static char flip(char a) {
		return a == '1' ? '0' : '1';
	}

	public static int minNum(String str, char expected) {
		int r = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != expected) {
				r++;
			}
			expected = flip(expected);
		}
		return r;
	}

	public static int numberOfFlips(String str) {
		return Math.min(minNum(str, '0'), minNum(str, '1'));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfFlips("0001010111"));
	}

}
