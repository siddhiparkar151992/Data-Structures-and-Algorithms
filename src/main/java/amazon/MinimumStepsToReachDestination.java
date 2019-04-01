package main.java.amazon;

public class MinimumStepsToReachDestination {
	
	public int getMinSteps(int source, int dest, int current){
		if(Math.abs(source) > Math.abs(dest)) return Integer.MAX_VALUE;
		if(source == dest) return current;
		int pos=  getMinSteps(source+current+1, dest, current+1);
		int neg=  getMinSteps(source-current-1, dest, current+1);
		return Math.min(pos, neg);
	}
	public static void main(String[] args) {
		int dest = 11;
		MinimumStepsToReachDestination  m= new MinimumStepsToReachDestination();
		System.out.println(m.getMinSteps(0, dest, 0));
	}

}
