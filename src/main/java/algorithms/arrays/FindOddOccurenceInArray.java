package main.java.algorithms.arrays;

public class FindOddOccurenceInArray {
	
	public int findOddOccurenceInArray(int[] arr) {
		int res = 0;
		for(int i=0;i<arr.length;i++){
			res = res ^ arr[i];
		}
		return res;

	}
	public static void main(String[] args) {
		FindOddOccurenceInArray f = new FindOddOccurenceInArray();
		System.out.println(f.findOddOccurenceInArray(new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2}));
	}

}
