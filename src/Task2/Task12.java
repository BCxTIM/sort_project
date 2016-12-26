package Task2;

import java.util.Random;

/**
 * Created by tmoiseev on 12/26/2016.
 */
public class Task12 {
    private static int n = 3;
    private static int[][] matrix = new int[n][n];
    private static Random random = new Random();
    private static int[] sumLine = new int[n];

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

    private static void sumLineMatrix() {
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + matrix[i][j];
            }
            System.out.println("sum line " + (i+1) + " = " + sum);
            sumLine[i] = sum;
        }
    }

    private static void sortLineArray() {
        sumLineMatrix();

        for (int min = 0; min < n - 1; min ++) {
            int least = min;

            for (int i = min; i < n; i ++) {
                if (sumLine[i] < sumLine[least]) {
                    least = i;
                }
            }

            swap(min, least);
        }
    }

    private static void swap(int i, int j) {
        for (int k = 0; k < n; k ++) {
            int tmp = matrix[i][k];
            matrix[i][k] = matrix[j][k];
            matrix[j][k] = tmp;
        }
    }

    public static void main(String[] args) {
        generateMatrix();
        showMatrix();

        sortLineArray();

        showMatrix();
    }

}
