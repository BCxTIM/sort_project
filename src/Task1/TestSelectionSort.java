package Task1;

import Task1.Array.Array;

/**
 * Created by tmoiseev on 11/8/2016.
 */
public class TestSelectionSort extends Array {

    public static void main(String[] args) {
        generateArray();
        showArray();

        for (int min = 0; min < array.length - 1; min ++) {
            int least = min;

            for (int i = min; i < array.length; i ++) {
                if (array[i] < array[least]) {
                    least = i;
                }
            }

            swap(min, least);
        }

        showArray();
    }
}
