package Task2;

/**
 * Created by tmoiseev on 12/26/2016.
 */
public class Task11MergeArrays {
    private static int[] array1 = {1, 5, 5};
    private static int[] array2 = {2, 6, 7};
    private static int[] array3 = {1, 4, 7, 8};

    private static int[] resArray = new int[array1.length + array2.length + array3.length];

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;

        int resIndex = 0;

        while (i < array1.length && j < array2.length && k < array3.length) {
            if(array1[i] < array2[j] && array1[i] < array3[k]) {
                resArray[resIndex] = array1[i];
                i++;
            } else if(array2[j] < array1[i] && array2[j] < array3[k]) {
                resArray[resIndex] = array2[j];
                j++;
            } else {
                resArray[resIndex] = array3[k];
                k++;
            }
            resIndex ++;
        }

        while (i < array1.length) {
            resArray[resIndex] = array1[i];
            resIndex ++;
            i ++;
        }

        while (j < array2.length) {
            resArray[resIndex] = array2[j];
            resIndex ++;
            j ++;
        }

        while (k < array3.length) {
            resArray[resIndex] = array3[k];
            resIndex ++;
            k ++;
        }

        for (int m = 0; m < resArray.length; m ++) {
            System.out.print(" " + resArray[m]);
        }
    }

}
