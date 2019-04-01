package bloomberg;

public class MaxProfitByK {

	public static void buyMaxProfitByk(int[] arr, int k) {

		int buy = 0;
		int[][] result = new int[k][2];

		int sell = 0;
		int i = 1;
		while (k > 0) {
			int cmax = sell;
			while (i< arr.length && buy < arr.length && sell < arr.length) {
				if(arr[sell] < arr[i] && arr[i] > arr[i+1]){
					if(arr[cmax] < arr[sell]){
						cmax = sell;
					}
					sell = i;
				}
				if(arr[i] < arr[buy]) {
					buy = i;
				}
				i++;
			}
			
			System.out.println("buy "+arr[buy]+" sell"+ arr[sell]);
			k--;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buyMaxProfitByk(new int[] { 10, 22, 5, 75, 65, 80 }, 2);
	}

}
