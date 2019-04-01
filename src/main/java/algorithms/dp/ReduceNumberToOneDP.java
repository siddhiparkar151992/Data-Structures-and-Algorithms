package main.java.algorithms.dp;

public class ReduceNumberToOneDP {
	
	public Integer[] dp = new Integer[10000];
	public int reduce(int n){
		
		if(n == 1) return 0;
		int a =  Integer.MAX_VALUE;
		int b =  Integer.MAX_VALUE;
		int c =  Integer.MAX_VALUE;
		if(n%3==0) {
			a = 1+ reduce(n/3);
		}
		else if(n%2==0) {
			b =1+ reduce(n/2);
		}
		else {
			c= 1+ reduce(n-1);
		}
		dp[n] = Math.min(a, Math.min(b, c));
		return Math.min(a, Math.min(b, c));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReduceNumberToOneDP r = new ReduceNumberToOneDP();
		
		System.out.println(r.reduce(4));
	}

}
