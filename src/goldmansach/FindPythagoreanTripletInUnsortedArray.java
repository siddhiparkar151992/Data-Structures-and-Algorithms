package goldmansach;

import java.util.Arrays;

public class FindPythagoreanTripletInUnsortedArray {

	public static void find(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}

		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			int l = 0;
			int r = i - 1;
			while (l < r) {
				if (arr[l] + arr[r] == arr[i]) {
					System.out.println(arr[l] + " " + arr[r] + " " + arr[i]);
					return;
				}

				if (arr[l] + arr[r] < arr[i]) {
					l++;
				} else {
					r--;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find(new int[] { 3, 1, 4, 6, 5 });
	}

}
