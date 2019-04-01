package main.java.amazon;

public class NumSubString {
	
	int f(int i, int j,char[] charArray ,int n, int[][] dp){
		if(i == n){
			return 0;
		}
		if(dp[i][j]!=-1){
			return dp[i][j];
		}
		
		int x=  charArray[i] - 0;
		int ans = ((x+j)%3==0 && x%2==0) ? 1: 0+ f(i+1,(j+x)%3,charArray, n, dp );
		return ans;
	}
	int count(char[] num){
		int n = num.length;
		int[][] dp = new int[n+1][3];
		int ans = 0;
		for(int i=0;i<num.length;i++){
			if(num[i] == 0){
				ans++;
			}else{
				ans+=f(i,0,num,num.length, dp);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
