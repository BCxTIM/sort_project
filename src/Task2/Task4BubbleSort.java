package Task2;

import Task1.Array.Array;

/**
 * Created by tmoiseev on 12/12/2016.
 */
public class Task4BubbleSort extends Array {

    public static void main(String[] args) {
        generateArray();
        showArray();

        int end = array.length;

        for (int i = 0; i < end; i ++) {
            for (int j = 1; j < end - 1; j ++) {
                if (array[j - 1] > array[j]) {
                    swap(j - 1, j);
                }
            }
        }
        showArray();
    }
}
