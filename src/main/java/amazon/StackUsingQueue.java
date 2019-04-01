package main.java.amazon;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	
	
	public void stack(int[] arr) {
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < arr.length; i++) {
			queue.add(arr[i]);
			for(int j=0;j<queue.size();j++){
				int x= queue.remove();
				queue.add(x);
			}
		}
		System.out.println(queue);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingQueue s= new StackUsingQueue();
		s.stack(new int[] {1,2,3,5,6});
	}

}
