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

    private static int line = 4;
    private static int column = 3;

    private static int start = matrix[4][3];

    private static void showIndex() {
        System.out.println(start);
    }

    private static void moveRight(int i, int j) {
        line = i;
        column = j + 1;
    }

    private static void moveDown(int i, int j) {
        line = i + 1;
        column = j;
    }

    private static void moveLeft(int i, int j) {
        line = i;
        column = j - 1;
    }

    private static void moveUp(int i, int j) {
        line = i - 1;
        column = j;
    }


    private static boolean checkConditions() {
        int rowsSize = matrix.length - 1;
        int columnsSize = matrix[0].length - 1;

        System.out.println(line + " " + column);

        if (line != rowsSize) {
            if (column != columnsSize) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        while (checkConditions()) {
            int k = line;
            int m = column;


            if (matrix[k][m + 1] == 0) {
                moveRight(line, column);
            } else if (matrix[k + 1][m] == 0) {
                moveDown(line, column);
            } else if (matrix[k][m - 1] == 0) {
                moveLeft(line, column);
            } else if (matrix[k - 1][m] == 0) {
                moveUp(line, column);
            } else {
                System.out.println("Из лабиинта невозможно выйти");
            }
        }

    }
}
