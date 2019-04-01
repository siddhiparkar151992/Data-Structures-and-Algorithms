package main.java.amazon;

public class RotateGivenMatrix {

	public void rotateUtil(int[][] matrix, int i, int j, int k) {
		int h = (i + j) / 2;
		int c = j;
		for (int r= 0; r < h; r++) {
			
		}
	}

	public void rotate(int[][] matrix, int k) {
		rotateUtil(matrix, 0, 0, k);
		System.out.println(matrix);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateGivenMatrix r = new RotateGivenMatrix();
		r.rotate(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, 2);
	}

}
