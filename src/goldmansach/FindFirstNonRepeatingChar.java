package goldmansach;

public class FindFirstNonRepeatingChar {
	
	public static void find(String str){
		int[][] count = new int[26][2];
		for(int i=0;i<str.length();i++){
			if(count[str.charAt(i) -'a'][0]!=0){
				count[str.charAt(i) -'a'][0]++;
			}else {
				count[str.charAt(i) -'a'] = new int[]{1, i};
			}
		}
		int minIndex = Integer.MAX_VALUE;
		for(int i=0;i<count.length;i++){
			if(count[i][0] ==1 && count[i][1] < minIndex){
				minIndex = count[i][1];
			}
		}
		System.out.println(str.charAt(minIndex));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find("geeksforgeeks");
	}

}
