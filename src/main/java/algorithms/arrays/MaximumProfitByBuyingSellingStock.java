package main.java.algorithms.arrays;

public class MaximumProfitByBuyingSellingStock {

    public static int finMaxProfit(int[] arr){
        int profit=0;
        int ci =0;
        while(ci< arr.length-1) {
            while (ci < arr.length-1 && arr[ci]<=arr[ci+1]){
                ci++;
            }

            if (ci==arr.length-1){
                break;
            }
            int buy = ci++;

            while (ci < arr.length-1 && arr[ci]>=arr[ci-1]){
                ci++;
            }

            int sell= ci-1;
            profit+=arr[sell]-arr[buy];

        }
        return profit;
    }

    public static void main(String... args){
        int price[] = { 2, 30, 15, 10, 8, 25, 80 };
        int n = price.length;
        System.out.println(finMaxProfit(price));
    }
}
