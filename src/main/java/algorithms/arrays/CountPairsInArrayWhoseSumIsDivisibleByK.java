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
        while (i < A.length){
            if (freq[k- A[i]] !=0) {
                sum++;
                freq[k- A[i]]--;
            }
            i++;
        }

        return sum;

    }

    public static void main(String... args) {
        int A[] = {5, 9, 36, 74, 52, 31, 42};
        int n = 6;
        int K = 3;
        System.out.print(countPairs(A, n, K));
    }
}
