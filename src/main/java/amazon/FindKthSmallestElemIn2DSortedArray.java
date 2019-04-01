package main.java.amazon;

public class FindKthSmallestElemIn2DSortedArray {

	class HeapSort {
		public void minheapify(int[][] arr, int i) {
			int min = i;
			int l = 2 * i;
			int r = l + 1;
			if (l < arr.length && arr[l][0] < arr[min][0]) {
				min = l;
			}
			if (r < arr.length && arr[r][0] < arr[min][0]) {
				min = r;
			}

			if (min != i) {
				int[] temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
				minheapify(arr, min);
			}
		}

		public void buildHeap(int[][] arr) {
			int n = arr.length;
			for (int i = n / 2; i >= 0; i--) {
				minheapify(arr, i);
			}
		}
	}

	HeapSort heap = new HeapSort();

	public int findKthElem(int[][] arr, int k) {
		int n = arr.length;
		int[][] harr = new int[arr[0].length][3];
		int r = -1;
		for (int i = 0; i < arr[0].length; i++) {
			harr[i] = new int[] { arr[0][i], 0, i };
		}
		int[] min = null;
		heap.buildHeap(harr);
		for (int i = 0; i < k; i++) {
			min = harr[0];
			int nextMin = min[1] < (n-1) ? arr[min[1]+1][min[2]] : Integer.MAX_VALUE;
			harr[0] =  new int[]{nextMin, min[1]+1, min[2]};
			heap.minheapify(harr, 0);
		}
		System.out.println(min[0]);
		return min[0];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindKthSmallestElemIn2DSortedArray f= new FindKthSmallestElemIn2DSortedArray();
		int[][] matrix = {{10, 20, 30, 40},{15, 25, 35, 45},{25, 29, 37, 48},{32, 33, 39, 50}};
		f.findKthElem(matrix, 7);
	}

}
