package bloomberg;

public class PrintMissingNumber {

	public static void print(int[] arr, int n) {
		int r = 0;
		int i = 0;
		for (; i < arr.length; i++) {
			r ^= arr[i];
			r ^= i;
		}
		r ^= i;
		System.out.println(r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(new int[] { 4, 3, 2, 0, 1, 7, 6 }, 8);
	}

}
