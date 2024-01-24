package main.java.algorithms.arrays;


public class PairWithSumInArray {
	
	public static int[] findPair(int[] arr, int sum){
		int[] result = new int[2];
		boolean[] index = new boolean[10000];
		for(int elem: arr){
			int temp = sum-elem;
			if(index[temp]){
				result[0]= temp;
				result[1]= elem;
				return result;
			}
			index[elem] = true;
		}
		return null;
		
	}
	public static void main(String[] args) {
			int[] arr = findPair(new int[]{0,5,9,4,17,6,8},25);
			System.out.println(arr);
	}

}
