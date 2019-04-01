package practice;

/**
 * Created by Siddhi Parkar on 17-02-2018.
 */
public class RangeOverlapping {
    public static void find(int[][] include, int[][] exclude) {
        int[][] output = new int[include.length * 2][2];
        int o = 0;
        int oe = 0;
        int i = 0;
        int e = 0;
        int ie = 0;
        int ee = 0;
        while (true) {
            if (include[i][ie] > exclude[e][ee]) {
                output[o][0] = exclude[e][ee] + 1;
                output[o][1] = include[i][ie];

                o++;
                if (ee > 0) {
                    e++;
                    ee = 0;
                } else {
                    ee = 1;
                }


            } else {
                output[o][0] = include[i][ie];
                output[o][1] = exclude[e][ee] - 1;
                if(o==0) o++;
                if (ie > 0) {
                    i++;
                    ie = 0;
                } else {
                    ie = 1;
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
