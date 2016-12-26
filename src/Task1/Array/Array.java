package Task1.Array;

import java.util.Random;

/**
 * Created by tmoiseev on 11/2/2016.
 */
public class Array {

    protected static int array[] = new int[11];
    protected static int start = 0;
    protected  static int end = array.length - 1;
    private static Random random = new Random();

    protected static void generateArray() {
        for(int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(30);
        }
    }

    protected static void showArray() {
        for (int i = 0; i< array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("");
    }

    protected static void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


}
