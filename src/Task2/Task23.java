package Task2;

import java.util.Arrays;

/**
 * Created by tmoiseev on 12/28/2016.
 */
public class Task23 {
    private static int[] array = {2, 5, 8, 2, 8, 3, 8, 3, 4, 2, 7, 2, 4, 8, 2, 5, 3, 3, 3, 7};
//    private static int[] array = {2, 5, 3, 3, 3, 3, 3, 3, 4, 2, 7, 2, 4, 8, 2, 5, 3, 3, 3, 7};
    // 2 2 2 2 2 3 3 3 7


    private static void showArray() {
        System.out.println(Arrays.toString(array));
    }

    private static int minEl(int[] arr, int pos) {
        int min = arr[pos];
        for (int i = pos; i < arr.length; i ++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }


    private static void result() {

        int pos = 0;

       for (int i = pos; i < array.length; i ++) {
           if(array[i] == minEl(array, pos)) {
               System.out.print(" " + array[i]);
               pos = i + 1;
           }
       }
    }

    public static void main(String[] args) {
        showArray();
        result();
    }
}
