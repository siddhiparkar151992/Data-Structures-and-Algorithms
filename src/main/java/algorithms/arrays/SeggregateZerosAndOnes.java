package main.java.algorithms.arrays;

public class SeggregateZerosAndOnes {

	public void seggregate(int[] arr) {
		int l = 0;
		int r = arr.length - 1;
		while (l < r) {
			while (l < r && arr[l] == 0) {
				l++;
			}

			while (l < r && arr[r] == 1) {
				r--;
			}
			
			if(l<r){
				arr[l] = 0;
				arr[r] = 1;
				l++;
				r--;
			}
		}
	}

	public static void main(String[] args) {
		SeggregateZerosAndOnes s = new SeggregateZerosAndOnes();
		int[] arr = { 0, 1, 0, 1, 1, 1 };
		s.seggregate(arr);
		System.out.println(arr);

	}

}
