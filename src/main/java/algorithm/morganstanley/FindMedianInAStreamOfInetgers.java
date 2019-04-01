package main.java.algorithm.morganstanley;

public class FindMedianInAStreamOfInetgers {
	MaxHeap maxHeap = new MaxHeap();
	MinHeap minHeap = new MinHeap();
	int root;

	public int getSize(int[] l, int[] r) {
		if (l.length == r.length) {
			return 0;
		}
		if (l.length > r.length) {
			return 1;
		} else {
			return -1;
		}
	}

	private int getMedian(int[] l, int[] r,int m, int n){
		int sig = getSize(l, r);
		switch(sig){
		case 1:
			if(n < m){
				minHeap.insert(maxHeap.deleteRoot(l), r);
				maxHeap.insert(n, l);
			}else{
				minHeap.insert(	n, r);
			}
			m = (minHeap.getTop(r) +  maxHeap.getTop(l))/2;
			break;
		case 0:
			if(n< m){
				maxHeap.insert(n, l);
				m = maxHeap.getTop(l);
			}else{
				minHeap.insert(n, r);
				m = minHeap.getTop(r);
			}
			break;
		case -1: // There are more elements in right (min) heap
			 
	        if( n < m ) // current element fits in left (max) heap
	        {
	            maxHeap.insert(n, l);
	        }
	        else
	        {
	            // Remove top element from right heap and
	            // insert into left heap
	            maxHeap.insert(minHeap.deleteRoot(r), l);
	 
	            // current element fits in right (min) heap
	            minHeap.insert(n, r);
	        }
	 
	        // Both heaps are balanced
	       m = (minHeap.getTop(r) +  maxHeap.getTop(l))/2;
	 
	        break;
		}
		return m;
	}

	public void getMedian(int[] arr) {
		int m = 0;
		int[] l = {};
		int[] r = {};
		for (int i = 0; i < arr.length; i++) {
			m = getMedian(l, r, m, arr[i]);
			System.out.println(m);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMedianInAStreamOfInetgers f= new FindMedianInAStreamOfInetgers();
		f.getMedian(new int[]{5, 15, 1, 3, 2, 8, 7, 9, 10, 6, 11, 4});
	}

}
