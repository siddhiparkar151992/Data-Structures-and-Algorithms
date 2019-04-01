package goldmansach;

public class LatticePoints {

	public static int findLatticePoints(int r) {
		int result = 4;
		for (int x = 1; x < r; x++) {
			int square = r*r - x*x;
			int y = (int) Math.sqrt(square);
			if(y*y == square){
				result+=4;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findLatticePoints(5);
	}

}
