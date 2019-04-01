package main.java.algorithms.arrays.heap;

/**
 * Created by Siddhi Parkar on 26-01-2018.
 */
public class Data implements Comparable<Data>{
    public int elem;
    public int row;
    public int col;

    public Data(int elem, int r, int c) {
        this.elem = elem;
        this.row = r;
        this.col = c;
    }

    @Override
    public int compareTo(Data o) {
        if( this.elem < o.elem) return -1;
        if(this.elem > o.elem) return 1;
        return 0;
    }
}
