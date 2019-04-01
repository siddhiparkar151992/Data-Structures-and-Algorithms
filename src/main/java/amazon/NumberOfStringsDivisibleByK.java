package main.java.amazon;

public class NumberOfStringsDivisibleByK {

	class R {
		int c = 0;
	}

	public void dynamicProgramming(int[][] mem, int i, String str, int k) {
		if(i+1 >= str.length()){
			return;
		}
		for (int j = i + 1; j < str.length(); j++) {
			int lastDigit = mem[j][0];
			if (j - 1 == i) {
				mem[i][j] = mem[i][0] + mem[j][0];
				
			} else {
				mem[i][j] = mem[i][j - 1] + mem[j][0];
			}
			if(mem[i][j]!=0 && mem[i][0]!=0){
				int num = Integer.valueOf(mem[i][j]);
				if(num % 3 ==0 && mem[j][0] % 2==0){
					System.out.println(str.substring(i, j+1));
				}
			}
			dynamicProgramming(mem, j, str, k);
		}
	}

	public void numberOfStrings(String str, int k) {
		int n = str.length();
		int[][] dp = new int[n][n];
		for (int i = 0; i < n; i++) {
			dp[i][0] = Integer.valueOf(String.valueOf(str.charAt(i)));
			if(dp[i][0] % 3 == 0){
				System.out.println(dp[i][0]);
			}
		}
		for (int i = 0; i < n; i++) {
			dynamicProgramming(dp, i, str, k);
		}

		System.out.println(dp);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfStringsDivisibleByK n = new NumberOfStringsDivisibleByK();
		n.numberOfStrings("4806", 6);
	}

}
