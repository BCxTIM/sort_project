package Task2;

import java.util.Arrays;

/**
 * Created by tmoiseev on 12/29/2016.
 */
public class Task20 {

    private static int[] array = {1, 3, 4, 6, 4, 6, 8, 9};

    public static void main(String[] args) {



        for (int i = 0; i < array.length - 1; i ++) {
            int val = array[i];
            if(array[i + 1] - 1 != val + 1) {
                System.out.print(" " + array[i]);
            }
        }

    }

}
