package Task2;


/**
 * Created by tmoiseev on 12/29/2016.
 */
public class Task20 {

    private static int[] array = {1, 3, 4, 6, 4, 6, 7, 12};


    //Not optimized
    public static void main(String[] args) {

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

    /*public static void main(String[] args) {

        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] != array[i + 1] - 1) {
                System.out.print(" " + array[i]);
            }
        }

    }*/

}
