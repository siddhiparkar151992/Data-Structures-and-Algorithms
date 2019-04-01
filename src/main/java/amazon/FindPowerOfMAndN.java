package main.java.amazon;

public class FindPowerOfMAndN {

	public int power(int x, int y) {
		if (y == 0) {
			return 1;
		}
		int temp = power(x, y / 2);
		if (y % 2 == 0) {
			return temp * temp;
		} else {
			return x * temp * temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPowerOfMAndN f = new FindPowerOfMAndN();
		System.out.println(f.power(2, 3));
	}

}
