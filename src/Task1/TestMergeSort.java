package Task1;

import Task1.Array.Array;

/**
 * Created by tmoiseev on 11/5/2016.
 */
public class TestMergeSort extends Array {

    private static int[] tempArr;

    private static void mergeSort() {
        tempArr = new int[array.length];
        doSort(0, array.length - 1);
    }

    private static void doSort(int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;

            doSort(start, middle);
            doSort(middle + 1, end);

            mergeArr(start, middle, end);
        }
    }

    private static void mergeArr(int start, int middle, int end) {
        for (int i = start; i <= end; i ++) {
            tempArr[i] = array[i];
        }

        int i = start;
        int j = middle + 1;
        int k = start;

        while (i <= middle && j <= end) {
            if (tempArr[i] < tempArr[j]) {
                array[k] = tempArr[i];
                i++;
            } else  {
                array[k] = tempArr[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            array[k] = tempArr[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {
        generateArray();
        showArray();

        mergeSort();

        showArray();
    }

}
