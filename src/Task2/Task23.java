package Task2;

import java.util.Arrays;

/**
 * Created by tmoiseev on 12/28/2016.
 */
public class Task23 {
    private static int[] array = {2, 5, 3, 4, 2, 2, 2, 4, 8, 2, 5, 3, 3, 7};
    // 2 2 2 2 2 3 3 3 7


    private static void showArray() {
        System.out.println(Arrays.toString(array));
    }


    private static void result() {

        int pos = 0;

       for (int i = pos; i < array.length; i ++) {
           for (int j = pos; j < array.length; j ++) {
                if(array[j] == array[i]) {
                    System.out.print(" " + array[i]);
                    pos = j;
                }
           }
       }
    }

    public static void main(String[] args) {
        showArray();
        result();
    }
}
