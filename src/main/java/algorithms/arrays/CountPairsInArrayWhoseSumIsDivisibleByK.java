package main.java.algorithms.arrays;

public class CountPairsInArrayWhoseSumIsDivisibleByK {

    public static int countPairs(int[] A, int n, int k) {
        int[] freq = new int[n];
        for (int i=0;i<n;i++){
            System.out.println(String.format("%s / %s = %s ", A[i], k, A[i]%k));
            freq[A[i]%k]+=1;
        }

        int sum =0;
        int i=0;
        while (true){
            if (freq[k- A[i]] !=0) {
                sum++;
                freq[k- A[i]]--;
            }
        }
    }

    public static void main(String... args) {
        int A[] = {2, 2, 1, 7, 5, 3};
        int n = 6;
        int K = 4;
        System.out.print(countPairs(A, n, K));
    }
}
