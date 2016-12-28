package Task2;

/**
 * Created by tmoiseev on 12/26/2016.
 */
public class Task13 {
    private static int[] array = {1, 2, 3, 4, 5, 6};
    private static int k = 3;

    public static void main(String[] args) {
        for (int i = 0; i < k; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
