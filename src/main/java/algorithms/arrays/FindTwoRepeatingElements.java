package main.java.algorithms.arrays;

public class FindTwoRepeatingElements {
	
	public static void findTwoRepeatingElements(int[] arr){
		
		
		for(int j=0;j<arr.length;j++){
			if(arr[Math.abs(arr[j])]>0){
				arr[Math.abs(arr[j])] = -arr[Math.abs(arr[j])];
			}
			else{
				System.out.println(-arr[j]);
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {4, 2, 4, 5, 2, 3, 1};
		findTwoRepeatingElements(arr);

	}

}
