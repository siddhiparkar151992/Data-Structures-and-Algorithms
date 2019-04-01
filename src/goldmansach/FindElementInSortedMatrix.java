package goldmansach;

public class FindElementInSortedMatrix {
	
	public static void find(int[][] matrix, int x){
		int rowLen = matrix.length;
		int colLen = matrix[0].length;
		
		int i = 0;
		int j = colLen -1;
		while(i < rowLen && j < colLen){
			if(x < matrix[i][j]){
				j--;
			}else if(x > matrix[i][j]){
				i++;
			}else{
				System.out.println(i+" "+j);
				return;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find(new int[][]{ {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}}, 30);
	}

}
