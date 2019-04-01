package practice;

/**
 * Created by Siddhi Parkar on 08-03-2018.
 */

public class Child2 extends Child1{
    public static int add(int x, int y) {
        return x + y;
    }

    public void parent() {
        System.out.println("parent");
    }

    public double next() {
        return 1.0;
    }
}
