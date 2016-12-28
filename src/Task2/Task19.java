package Task2;


import java.util.Arrays;
import java.util.Random;

/**
 * Created by tmoiseev on 12/28/2016.
 */
public class Task19 {

    private static int n = 4;
    private static int[] array = new int[n];
    private static Random random = new Random();

    private static void givenArray() {
        System.out.println("Given array");
        System.out.println(Arrays.toString(array));
    }

    private static void generateArray() {
        for (int i = 0; i < array.length; i ++) {
            array[i] = random.nextInt(10);
        }
    }

    private static void showCombinations() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }


    private static void permutations() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {

                showCombinations();

                int tmp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        generateArray();
        givenArray();

        System.out.println("Show all permutations");

        permutations();

    }
}
