package main.java.amazon;

public class CountDigitCombinations {

	public void countDigit(String arr, int i, String result) {
		result+=" ";
		if(i+1< arr.length()) {
			for (int k = i+1; k < arr.length(); k++) {
				countDigit(arr, k, result += Character.valueOf(arr.charAt(k)));
			}
			System.out.println(result);	
		}
	}

	public void count(String arr) {
		String r = "";
		for (int i = 0; i < arr.length(); i++) {
			r += Character.valueOf(arr.charAt(i));
			countDigit(arr, i, r);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDigitCombinations c= new CountDigitCombinations();
		c.count("1234");
	}

}
