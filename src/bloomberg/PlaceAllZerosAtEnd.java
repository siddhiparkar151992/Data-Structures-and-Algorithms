package bloomberg;

public class PlaceAllZerosAtEnd {

	public static void place(int[] arr) {
		int nonZeroIndex = 0;
		int zeroIndex = 0;
		while (zeroIndex < arr.length) {
			if (arr[zeroIndex] == 0) {
				break;
			}
			zeroIndex++;
		}
		nonZeroIndex = zeroIndex + 1;
		while (nonZeroIndex< arr.length && nonZeroIndex < arr.length) {
			if (arr[nonZeroIndex] != 0 && arr[zeroIndex] == 0) {
				int temp = arr[nonZeroIndex];
				arr[nonZeroIndex] = arr[zeroIndex];
				arr[zeroIndex] = temp;
				nonZeroIndex++;
				zeroIndex ++;
			}else if(arr[nonZeroIndex]==0){
				nonZeroIndex++;
			}
		}
		System.out.println(arr);
	}

	public static void main(String[] args) {
		place(new int[]{0,0,0,8,1,2});
	}

}
