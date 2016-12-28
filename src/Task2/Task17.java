package Task2;

import java.util.Random;

/**
 * Created by tmoiseev on 12/27/2016.
 */
public class Task17 {

    private static int n = 2;
    private static int[][] matrix = new int[n][n];
    private static Random random = new Random();

    private static void generateMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
    }

    private static void showMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int det(int[][] matrix) {
        int det = 0;
        int symbol; //(+) or (-)

        if (matrix.length == 1) {
            det = matrix[0][0];
        } else if (matrix.length == 2) {
            det = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            for (int i = 0; i < matrix.length; i++) {

                int[][] tempArr = new int[matrix.length - 1][matrix.length - 1];

                for (int j = 1; j < matrix.length; j++) {

                    for (int l = 0; l < matrix.length; l++) {

                        if (l < i) {
                            tempArr[j - 1][l] = matrix[j][l];
                        } else if (l > i) {
                            tempArr[j - 1][l - 1] = matrix[j][l];
                        }
                    }
                }
                if (i % 2 == 0) {
                    symbol = 1;
                } else {
                    symbol = -1;
                }
                det += symbol * matrix[0][i] * (det(tempArr));
            }
        }

        return det;
    }


    public static void main(String[] args) {
        generateMatrix();
        showMatrix();
        System.out.println("Determinant is: " + det(matrix));
    }
}
