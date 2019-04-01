package main.java.amazon;

public class MaximizeNumberZerosFlippingSubarrays {

	public void maximizeFlip(int[] arr) {
		
		int count = 0;
		int maxSofar= 0;
		int max =0;
		int recentIndex = -9999;
		for (int i = 0; i < arr.length; i++) {
			int item = arr[i];
			if(item == 0){
				count+=1;
				max+=1;
				maxSofar+=1;
			}
			
			else if(item  == 1){
				if(recentIndex != i-1){
					maxSofar = count+1;
					recentIndex = i;
				}else{
					maxSofar+=1;
					recentIndex = i;
				}
				if(max< maxSofar){
					max = maxSofar;
				}
			}
			
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximizeNumberZerosFlippingSubarrays m = new MaximizeNumberZerosFlippingSubarrays();
		m.maximizeFlip(new int[]{0, 0, 0, 1, 0, 1});
	}

}
