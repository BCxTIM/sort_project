package Task1.Array;


/**
 * Created by tmoiseev on 11/28/2016.
 */
public class InvertArray extends Array {

    public static void main(String[] args) {
        generateArray();
        showArray();

        int end = array.length - 1;

        for (int i = 0; i < array.length / 2; i++) {
            swap(i, end);
            end--;
        }

        showArray();
    }
}
