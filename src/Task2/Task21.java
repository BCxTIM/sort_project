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


    public static void main(String[] args) {

        int rows = matrix.length - 1;
        int columns = matrix[0].length - 1;

        System.out.println(columns);
        System.out.println(rows);

        while (line != rows || column != columns) {
            if(matrix[line][column + 1] == 0) {
                moveRight(line, column);
            } else if(matrix[line + 1][column] == 0) {
                moveDown(line, column);
            } else if(matrix[line][column - 1] == 0) {
                moveLeft(line, column);
            } else if(matrix[line - 1][column] == 0) {
                moveUp(line, column);
            } else {
                System.out.println("Из лабиинта невозможно выйти");
            }
        }

    }
}
