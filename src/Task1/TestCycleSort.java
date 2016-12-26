package Task1;

import Task1.Array.Array;

/**
 * Created by tmoiseev on 11/22/2016.
 */
public class TestCycleSort extends Array {

    public static void main(String[] args) {
        generateArray();
        showArray();

        cycleSort();

        showArray();
    }

    protected static void cycleSort() {
        for (int cycleStart= 0; cycleStart < array.length - 1; cycleStart ++) {
            int val = array[cycleStart];

            int pos = cycleStart;

            for (int i = cycleStart + 1; i < array.length; i ++) {
                if(array[i] < val) {
                    pos ++;
                }
            }

            if (pos == cycleStart) {
                continue;
            }

            if (val == array[pos]) {
                pos ++;
            }

            int tmp = array[pos];
            array[pos] = val;
            val = tmp;

            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < array.length; i ++) {
                    if (array[i] < val) {
                        pos ++;
                    }
                }

                if (val == array[pos]) {
                    pos ++;
                }

                tmp = array[pos];
                array[pos] = val;
                val = tmp;
            }
        }
    }

}
