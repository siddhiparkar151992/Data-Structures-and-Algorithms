import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Siddhi Parkar on 09-02-2018.
 */
public class Booking {

    static boolean isTriangle(int a, int b, int c){
        return (a+b) > c;
    }
    static int triangle(int a, int b, int c) {
        if (a == b && b == c) {
            return 1;
        }
        if (a < 0 || b < 0 || c < 0 || a == 0 || b == 0 || c == 0) {
            return 0;
        }
        if (isTriangle(a,b,c) || isTriangle(a, c, b) || isTriangle(b, a, c) || isTriangle(b , c, a) ||
                isTriangle(c, a, b)|| isTriangle(c, b, a)){
            return 2;
        }
        return 0;
    }

    /*
     * Complete the function below.
     */
    static int[] delta_encode(int[] array) {
        int n = array.length;
        List<Integer> result = new ArrayList<>();
        int rc = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result.add(array[i]);
                continue;
            }
            int diff = array[i] - array[i - 1];
            if (diff > 127 || diff < -127) {
                result.add(-128);
            }
            result.add(diff);
        }
        int[] outputList = new int[result.size()];
        for (int i = 0; i < outputList.length; i++) {
            System.out.println(result.get(i));
            outputList[i] = result.get(i);
        }

        return outputList;

    }

    static class CallTiming {
        int startTime;
        int endTime;

    }
    static int howManyAgentsToAdd(int noOfCurrentAgents, int[][] callsTimes) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for( int i=0;i<callsTimes.length;i++){
            for( int j=0;j<callsTimes.length;j++){
                map.put(i, j);
                if(i==j) continue;
                if(j>i && !(callsTimes[i][0] >= callsTimes[j][1])){
                    count++;
                }
            }
        }
        return count-noOfCurrentAgents;
    }

    public static void main(String[] args) {
//        delta_encode(new int[]{});
//        System.out.println(triangle(100, 90, 200));
        System.out.println(howManyAgentsToAdd(3, new int[][]{
                {1,4},
                {1,5},
                {2,4},
                {1,3},
        }));
    }

}
