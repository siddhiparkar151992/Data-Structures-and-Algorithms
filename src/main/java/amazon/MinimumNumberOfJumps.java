package main.java.amazon;

public class MinimumNumberOfJumps {
	
	public class m{
		int minJumps = Integer.MAX_VALUE;
	}
	public m min = new m();
	public void minJumps(int[] arr, int start, int cj){
		if(start == arr.length-1 && cj < min.minJumps){
			min.minJumps = cj;
		}
		if(start < arr.length){
			for(int i=start+1;i<arr.length && i<= start+arr[start];i++){
				minJumps(arr, i, cj+1);
			}
		}
	}
	
	public void minJumps(int[] arr){
		minJumps(arr, 0, 0);
		System.out.println(min.minJumps);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumNumberOfJumps m = new MinimumNumberOfJumps();
		m.minJumps(new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9});
	}

}
