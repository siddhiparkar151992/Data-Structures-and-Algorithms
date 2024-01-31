package main.java.algorithms.arrays;

public class MinimumNumberOfPlatforms {

    public static void min(int[] arrivals, int[] departures) {
        int a = 0;
        int d = 0;

        int noOfPlatforms = 1;
        while (true) {
            if (a >= arrivals.length || d >= departures.length) {
                break;
            }
            if (arrivals[a] < arrivals[d]) {
                a++;
                noOfPlatforms--;
            } else {
                if (arrivals[a] == departures[d]) {
                    a++;
                    d++;
                } else {
                    d++;
                    noOfPlatforms++;
                }
            }
        }

        while (a < arrivals.length) {
            noOfPlatforms++;
            a++;
        }
        while (d < departures.length) {
            noOfPlatforms--;
            d++;
        }
        System.out.println(noOfPlatforms);
    }

    public static void main(String... args) {
        int arr[] = {100, 300, 500};
        int dep[] = {900, 400, 600};
        min(arr, dep);
    }
}
