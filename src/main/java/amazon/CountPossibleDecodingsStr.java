package main.java.amazon;

public class CountPossibleDecodingsStr {

	public void count(String str) {
		String curr = "";
		for (int i = 0; i < str.length(); i++) {
			curr += str.charAt(i);
			countutil(str, i, curr);
		}
	}

	private void countutil(String str, int i, String curr) {
		if (i + 1 < str.length()) {
			System.out.println( curr + " " + str.substring(i + 1));

			for (int j = i + 1; j < str.length(); j++) {
				curr +=" "+ str.charAt(j);
				countutil(str, j, curr);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountPossibleDecodingsStr c= new CountPossibleDecodingsStr();
		c.count("NITIN");
	}

}
