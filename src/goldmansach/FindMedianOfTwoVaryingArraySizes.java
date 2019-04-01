package goldmansach;

public class FindMedianOfTwoVaryingArraySizes {

	public void find(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int mid = 0;
		if (m == 0 && n == 2) {
			mid = n / 2;
			System.out.println(arr2[mid]);
		} else if (m == 1 && n == 1) {
			System.out.println((arr1[0] + arr2[0]) / 2);
		} else if (m == 1 && n % 2 != 0) {
			mid = n / 2;
			if (arr1[0] < arr2[mid] && arr1[0] < arr2[mid - 1]) {
				System.out.println((arr2[mid] + arr2[mid - 1]) / 2);
			} else if (arr1[0] > arr2[mid - 1] && arr1[0] < arr2[mid]) {
				System.out.println((arr1[0] + arr2[mid]) / 2);
			} else if (arr1[0] > arr2[mid] && arr1[0] < arr2[mid + 1]) {
				System.out.println((arr1[0] + arr2[mid + 1]) / 2);
			} else if (arr1[0] > arr2[mid] && arr1[0] > arr2[mid + 1]) {
				System.out.println((arr2[mid] + arr2[mid + 1]) / 2);
			}
		}else if(m ==1 && n%2 == 0){
			mid = n/2;
			if(arr1[0] < arr2[mid]){
				System.out.println(arr2[mid]);
			}else if(arr1[0] > arr2[mid] && arr1[0] < arr2[mid+1]){
				System.out.println(arr1[0]);
			}else if(arr1[0] > arr2[mid] && arr1[0] > arr2[mid+1]){
				System.out.println(arr2[mid+1]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
