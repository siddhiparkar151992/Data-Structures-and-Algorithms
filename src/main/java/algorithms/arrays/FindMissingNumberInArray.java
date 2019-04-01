package main.java.algorithms.arrays;

public class FindMissingNumberInArray {
	public int findMissingNumber(int[] arr) {
		int n = arr.length + 1;
		int sum = (n * (n + 1)) / 2;
		for (int i = 0; i < arr.length; i++) {
			sum -= arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		FindMissingNumberInArray f = new FindMissingNumberInArray();
		System.out.println(f.findMissingNumber(new int[] {1,5,2,3,8,6,7}));
	}
}
