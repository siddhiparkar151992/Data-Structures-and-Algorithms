package main.java.algorithms.arrays;

public class NonAdjecentMaxSum {

	public boolean checkIfAdjecent(int i1, int i2) {
		if (i1 - i2 == 1 || i1 - i2 == -1)
			return true;
		return false;
	}

	public int getMaxsumInArray(int[] arr) {
		int m1 = -2;
		int m2 = -2;
		int count = 0;
		while (count < arr.length) {
			int c = arr[count];
			if ((m1 < 0 || arr[m1] < c) && !checkIfAdjecent(m1, count)) {
				m2 = m1;
				m1 = count;
				
			} else if ((m2 > 0  && arr[m2] < c) && !checkIfAdjecent(m2, c)) {
				m2 = count;
			}
			count++;
		}
		return -1;
	}

	public static void main(String[] args) {
		NonAdjecentMaxSum n = new NonAdjecentMaxSum();
		
		System.out.println(n.getMaxsumInArray(new int[]{3,2,6,10,7}));
	}
}
