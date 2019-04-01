package main.java.amazon;

public class ReduceNumberTo1 {
	
	public int reduce(int num){
		int a= Integer.MAX_VALUE;
		int c =  Integer.MAX_VALUE;
		int b =  Integer.MAX_VALUE;
		if(num ==1) return 0;
		if(num%3==0){
			a =  1+reduce(num/3);
		}
		else if(num%2==0){
			b = 1+reduce(num/2);
		}else{
			c = 1+reduce(num-1);
		}
		
		return Math.min(a, Math.min(b, c));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReduceNumberTo1 r = new ReduceNumberTo1();
		
		System.out.println(r.reduce(4));
	}

}
