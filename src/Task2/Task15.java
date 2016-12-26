package Task2;

import java.util.Random;

/**
 * Created by tmoiseev on 12/26/2016.
 */
public class Task15 {
    private static int n = 3;
    private static int[][] matrix = new int[n][n];
    private static Random random = new Random();

    private static int[][] resArray = new int[n][n];

    private static void generateMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
    }

    private static void showMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void showResArray() {
        for (int i = 0; i < resArray.length; i++) {
            for (int j = 0; j < resArray.length; j++) {
                System.out.print(" " + resArray[i][j]);
            }
            System.out.println();
        }
    }

    private static void rotateArray() {
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix.length; j++) {
                resArray[i][j] = matrix[matrix.length - j  - 1][i];
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        generateMatrix();
        showMatrix();

        rotateArray();
        showResArray();
    }
}
