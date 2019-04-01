package main.java.amazon;

public class FindSumOfElementsInmatrixExceptCurrent {

	public void find(int[][] matrix, int i, int j) {
		int rowLen = matrix.length;
		int colLen = matrix[0].length;
		int preRowStart = 0;
		int preRowEnd = i - 1;

		int nextRowStart = i + 1;
		int nextRowEnd = rowLen - 1;

		int preColStart = 0;
		int preColEnd = j - 1;

		int nextColStart = j + 1;
		int nextColEnd = colLen - 1;

		for (int k = preRowStart; k <= preRowEnd; k++) {
			for (int m = preColStart; m <= preColEnd; m++) {
				System.out.println(matrix[k][m]);
			}
		}

		for (int k = preRowStart; k <= preRowEnd; k++) {
			for (int m = nextColStart; m <= nextColEnd; m++) {
				System.out.println(matrix[k][m]);
			}
		}

		for (int k = nextRowStart; k <= nextRowEnd; k++) {
			for (int m = preColStart; m <= preColEnd; m++) {
				System.out.println(matrix[k][m]);
			}
		}

		for (int k = nextRowStart; k <= nextRowEnd; k++) {
			for (int m = nextColStart; m <= nextColEnd; m++) {
				System.out.println(matrix[k][m]);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindSumOfElementsInmatrixExceptCurrent f = new FindSumOfElementsInmatrixExceptCurrent();
		f.find(new int[][] { { 1,2,3,4,5 }, { 6,7,8,9,10}, { 11,12,13,14,15}, { 16,17,18,19,20},
				{ 21,22,23,24,25 } }, 1, 1);
	}

}
