package Task1;

import Task1.Array.Array;

/**
 * Created by tmoiseev on 11/3/2016.
 */
public class TestQuickSort extends Array {

    public static void main(String[] args) {
        generateArray();
        showArray();

        quickSort(0, array.length - 1);

        showArray();
    }

    private static void quickSort(int start, int end) {
        if (start >= end) {
            return;
        }

        int i = start;
        int j = end;
        int c = (i + j) / 2;

        while (i < j) {
            while (i < c && array[i] <= array[c]) {
                i++;
            }

            while (j > c && array[c] <= array[j]) {
                j--;
            }

            if (i < j) {
                swap(i, j);

                if(c == i) {
                    c = j;
                }  else if (c == j) {
                    c = i;
                }
            }
            quickSort(start, c);
            quickSort(c + 1, end);
        }
    }
}