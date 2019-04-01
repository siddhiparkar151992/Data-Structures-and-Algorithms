package main.java.amazon;

import java.util.Collections;
import java.util.List;

public class MinimumNumberofPlatformRequired {

	public void minNum(List<Integer> arr, List<Integer> dep) {
		Collections.sort(arr);
		Collections.sort(dep);
		
		int min = 0;
		int i = 0;
		int j = 0;
		int curr = 0;
		while (i < arr.size() && j < dep.size()) {
			if(curr > min){
				min = curr;
			}
			if(arr.get(i) < dep.get(j)){
				curr+=1;
				i++;
			}else{
				curr-=1;
				j++;
			}
//			System.out.println(curr);
			if(curr > min){
				min = curr;
			}
		}
		
		while(i < arr.size()){
			if(curr > min){
				min = curr;
			}
			curr+=1;
			i++;
		}
		
		while(j < dep.size()){
			if(curr > min){
				min = curr;
			}
			curr-=1;
			j++;
		}
		System.out.println(min);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumNumberofPlatformRequired m = new MinimumNumberofPlatformRequired();
//		m.minNum(new int[]{1000 ,1100 ,1200 ,1300 ,1400 ,1500 ,1600, 1800}, 
//				new int[]{1130, 1130 ,1202 ,1302, 1630, 1630, 1602, 1802});
	}

}
