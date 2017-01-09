package Task2;


import java.util.Arrays;
import java.util.Random;

/**
 * Created by tmoiseev on 12/29/2016.
 */
public class Task20 {

    private static int n = 10;
    private static Random random = new Random();
    private static int[] array = new int[n];

    private static void generateArray() {
        for (int i = 0; i < n; i ++) {
            array[i] = random.nextInt(10);
        }
    }

    //Not optimized
    public static void main(String[] args) {

        generateArray();
        System.out.println(Arrays.toString(array));

        if(array[0] + 1 != array[1] ) {
            System.out.print(" " + array[0]);
        }

        for (int i = 1; i < array.length - 1; i ++) {
           if(array[i] != array[i + 1] - 1 && array[i] != array[i - 1] + 1) {
               System.out.print(" " + array[i]);
           }
        }

        if (array[array.length - 1] != array[array.length - 2] + 1) {
            System.out.print(" " + array[array.length - 1]);
        }
    }


}
