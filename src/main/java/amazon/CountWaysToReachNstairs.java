package main.java.amazon;

public class CountWaysToReachNstairs {

	public class Result {
		int total = 0;
	}

	Result r = new Result();

	public void countWaysUtil(int i, int num, int sum) {
		if(sum > num){
			return;
		}
		if (sum == num) {
			r.total += 1;
			return;
		}
		
		for (int m = 1; m <= 2; m++) {
			sum+=m;
			countWaysUtil(m, num, sum);
			sum-=m;
		}
	}

	public void countWays(int num) {
		int sum = 0;
		for (int i = 1; i <= 2; i++) {
			countWaysUtil(i, num, i);
		}
		System.out.println(r.total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountWaysToReachNstairs c= new CountWaysToReachNstairs();
		c.countWays(4);
	}

}
