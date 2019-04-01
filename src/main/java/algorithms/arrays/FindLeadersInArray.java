package main.java.algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindLeadersInArray {

	public List<Integer> findLeaders(int[] arr) {
		List<Integer> output= new ArrayList<Integer>();
		int currentGreatest = -9999;
		for (int i = arr.length - 1; i > 0; i--) {
			int current = arr[i];
			if(current > currentGreatest){
				currentGreatest = current;
				output.add(currentGreatest);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		FindLeadersInArray f= new FindLeadersInArray();
//		System.out.println(f.findLeaders(new int[]{16, 17, 4, 3, 5, 2}));
		System.out.println(f.findLeaders(new int[]{0,79,30,5,8,2,1}));
	}
}
