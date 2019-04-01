package main.java.algorithms.arrays.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Siddhi Parkar on 26-01-2018.
 */


public class GenericMinHeap<T extends Data> {
    private List<T> heapArray;

    public List<T> getHeapArray() {
        return heapArray;
    }
    public T getMin(){
        return heapArray.get(0);
    }
    public void setHeapArray(List<T> heapArray) {
        this.heapArray = heapArray;
    }

    public GenericMinHeap(List<T> arr) {
        this.heapArray = arr;
    }

    public T replaceMin(T min) {
        T oldMin = heapArray.get(0);
        heapArray.set(0, min);
        heapify(0);
        return oldMin;
    }

    public T extractMin() {
        T min = heapArray.get(0);
        List<T> newheap = new ArrayList<>();
        for (int i = 1; i < heapArray.size(); i++) {
            newheap.add(heapArray.get(i));
        }
        return min;
    }

    public void heapify(int i) {
        int min = i;
        int l = 2 * i + 1;
        int r = l + 1;
        if (l < heapArray.size() && heapArray.get(min).elem > heapArray.get(l).elem) {
            min = l;
        }
        if (r < heapArray.size() && heapArray.get(min).elem > heapArray.get(r).elem) {
            min = r;
        }
        if (min != i) {
            T temp = heapArray.get(min);
            heapArray.set(min, heapArray.get(i));
            heapArray.set(i, temp);
            heapify(i);
        }
    }

    public void buildHeap() {
        for (int i = heapArray.size() / 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }
}
