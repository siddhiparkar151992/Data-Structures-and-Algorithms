package main.java.algorithms.arrays;

import java.util.Arrays;

public class FindTripletInArray {

	public static void find(int[] arr, int sum) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-2; i++) {
			int l = i + 1;
			int r = arr.length-1;
			while (l<arr.length && r< arr.length && l < r) {
				if (arr[i] + arr[l] + arr[r] == sum) {
					System.out.println(arr[i]+" " + arr[l] +" "+ arr[r] );
					break;
				}
				if (arr[i] + arr[l] + arr[r] > sum) {
					r--;
				} else {
					l++;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find(new int[]{12, 3, 4, 1, 6, 9}, 24);
	}

}
