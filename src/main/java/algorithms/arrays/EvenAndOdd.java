package main.java.algorithms.arrays;

public class EvenAndOdd {
	
	public static  void rearrange(int[] arr){
		int e = 0;
		int o= 1;
		while(true) {
			
			if(e< arr.length && o<arr.length && arr[e]%2!=0 && arr[o]%2==0){
				int temp = arr[e];
				arr[e] = arr[o];
				arr[o] = temp;
				e+=2;
				o+=2;
			}else if(e< arr.length && o<arr.length && arr[e]%2==0 && arr[o]%2!=0) {
				e+=2;
				o+=2;
			}
			else if(e< arr.length && o<arr.length && arr[e]%2==0 && arr[o]%2==0) {
				e+=2;
			}else if(e< arr.length && o<arr.length && arr[e]%2!=0 && arr[o]%2!=0) {
				o+=2;
			}else{
				break;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rearrange(new int[]{6,4,8,1,3,5});
	}

}
