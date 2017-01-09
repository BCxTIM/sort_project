package Task2;


/**
 * Created by tmoiseev on 12/29/2016.
 */
public class Task20 {

    private static int[] array = {1, 3, 4, 6, 4, 6, 8, 12};


    //Not optimized
    public static void main(String[] args) {

        if(array[0] + 1 != array[1] ) {
            System.out.print(" " + array[0]);
        }
        for (int i = 1; i < array.length - 1; i ++) {
           if(array[i] + 1 != array[i + 1]) {
               System.out.print(" " + array[i]);
           }
        }

        if (array[array.length - 1] != array[array.length - 2] + 1) {
            System.out.print(" " + array[array.length - 1]);
        }
    }

}
