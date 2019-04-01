package main.java.amazon;

public class HouseColoringWithThreeColors {

	public void findMinColoringCost(int[][] cost) {
		int result = 0;
		int r = cost.length+1;
		int[][] minCost = new int[r][cost[0].length];
		for(int i=0;i<3;i++){
			minCost[0][i] = 0;
		}
		
		for (int i = 1; i < r; i++) {
			
			minCost[i][0] = Math.min(minCost[i-1][1], minCost[i-1][2]) + cost[i-1][0];
			minCost[i][1] = Math.min(minCost[i-1][0], minCost[i-1][2]) + cost[i-1][1];
			minCost[i][2] = Math.min(minCost[i-1][0], minCost[i-1][1]) + cost[i-1][2];
			
			
		}
		result = Math.min(minCost[r-1][0], Math.min(minCost[r-1][1], minCost[r-1][2]));
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseColoringWithThreeColors h = new HouseColoringWithThreeColors();
		h.findMinColoringCost(new int[][] {{7, 5, 10},
	          {3, 6, 1},
	          {8, 7, 4},
	          {6, 2, 9},
	          {1, 4, 7},
	          {2, 3, 6},
	         });
	}

}
