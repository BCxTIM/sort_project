package Task2;

/**
 * Created by tmoiseev on 1/17/2017.
 */
public class Task21 {
    private static int[][] matrix = {
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 1, 1, 1, 0, 1},
            {1, 0, 1, 0, 0, 1},
            {1, 0, 0, 0, 0, 1},
            {0, 1, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 1},
    };

    private static int start = matrix[4][3];

    private static void showIndex() {
        System.out.println(start);
    }

    public static void main(String[] args) {
        showIndex();
    }
}
