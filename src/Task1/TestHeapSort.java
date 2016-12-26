package Task1;

import Task1.Array.Array;

/**
 * Created by tmoiseev on 11/14/2016.
 */
public class TestHeapSort extends Array {

    private static int heapSize;

    private static void buildHeap() {
        heapSize = array.length;
        for (int i = array.length / 2; i >=0; i--) {
            heapify(i);
        }
    }

    private static void heapify(int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest = i;

        if(l < heapSize && array[i] < array[l]) {
            largest = l;
        }

        if(r < heapSize && array[largest] < array[r]) {
            largest = r;
        }

        if (i != largest) {
            swap(i, largest);
            heapify(largest);
        }
    }

    public static void main(String[] args) {
        generateArray();
        showArray();
        buildHeap();

        while (heapSize > 1) {
            swap(0, heapSize - 1);
            heapSize --;
            heapify(0);
        }

        showArray();
    }
}
