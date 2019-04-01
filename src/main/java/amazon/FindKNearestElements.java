package main.java.amazon;

public class FindKNearestElements {

	public int binarySearch(int[] arr, int l, int h, int x) {
		if (x >= arr[h])
			return h;
		if (x < arr[l])
			return l;
		int mid = (l + h) / 2;
		if (arr[mid] <= x && arr[mid + 1] > x)
			return mid;
		if (x > arr[mid]) {
			return binarySearch(arr, mid + 1, h, x);
		}
		return binarySearch(arr, l, mid - 1, x);
	}

	public void findKNearest(int[] arr, int k, int elem) {
		int l = binarySearch(arr, 0, arr.length - 1, elem);
		int r = l + 1;
		if (arr[l] == elem)
			l--;
		
		int count = 0;
		while (l >= 0 && r < arr.length && count < k) {
			if (elem - arr[l] < arr[r] - elem) {
				System.out.println(arr[l]);
				l--;
			} else {
				System.out.println(arr[r]);
				r++;
			}
			count++;
		}

		while (count < k && l >= 0) {
			System.out.println(arr[l]);
			l--;
			count++;
		}
		while (count < k && r < arr.length) {
			System.out.println(arr[r]);
			r++;
			count++;
		}
	}

	public static void main(String[] args) {
		FindKNearestElements f = new FindKNearestElements();
		f.findKNearest(new int[]{12, 16, 22, 30, 35, 39, 42,
                45, 48, 50, 53, 55, 56}, 4, 35);
	}

}
