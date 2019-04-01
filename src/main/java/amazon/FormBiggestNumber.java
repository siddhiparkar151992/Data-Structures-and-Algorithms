package main.java.amazon;

import java.util.Comparator;

/**
 * Created by Siddhi Parkar on 20-03-2018.
 */
public class FormBiggestNumber {
    class BigComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            int xy = Integer.valueOf(o1.toString()+ o2.toString());
            int yx = Integer.valueOf(o2.toString()+ o1.toString());
            return xy - yx;
        }
    }
    public static void arrange() {

    }
    public static void main(String[] args) {

    }
}
