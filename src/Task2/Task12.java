package Task2;

import java.util.Random;

/**
 * Created by tmoiseev on 12/26/2016.
 */
public class Task12 {
    private static int n = 3;
    /*private static int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
    };*/
    private static int[][] matrix = new int[n][n];
    private static Random random = new Random();

    protected static void generateMatrix() {
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

    private static void sumLineMatrix() {
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + matrix[i][j];
            }
            System.out.println("sum line " + i + " = " + sum);
        }
    }

    public static void main(String[] args) {
        generateMatrix();
        showMatrix();
        sumLineMatrix();
    }
}
