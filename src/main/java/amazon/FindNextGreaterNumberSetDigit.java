package main.java.amazon;

public class FindNextGreaterNumberSetDigit {
	
	public void nextGreater(String num){
		int start = num.length()-1;
		String curr = num;
		String[] nextGreater = new String[num.length()];
		int i = num.length() - 1;
		while(start > 0){
			int currDigit= Integer.parseInt(num.substring(start-1, start));
			if(currDigit < Integer.parseInt(num.substring(start, start+1))){
				int lastDigit = start+1;
				for(int j=start+1;j<num.length();j++){
					int c= Integer.parseInt(num.substring(j-1, j));
					if(c < num.charAt(lastDigit)){
						lastDigit = c;
					}
				}
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
