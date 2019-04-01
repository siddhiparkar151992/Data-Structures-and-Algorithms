package practice;

/**
 * Created by Siddhi Parkar on 08-03-2018.
 */
public class Child1 extends Parent{
    public static int add(int x, int y) {
        return x + y;
    }

    public void parent() {
        System.out.println("parent");
    }

    public double next() {
        return 1;
    }
    public int next(int i, int j){
        return 0;
    }
}
