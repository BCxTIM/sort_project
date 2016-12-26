package Task2;

/**
 * Created by tmoiseev on 12/15/2016.
 */
public class Task7MagicSquare {

    private static int n = 5;
    private static int[][] magicSquare = new int[n][n];

    private static void generateMagicSquare() {
        int number = 1;
        int row = 0;
        int column = n / 2;
        int curr_row;
        int curr_col;

        while (number <= n * n) {
            magicSquare[row][column] = number;
            number++;
            curr_row = row;
            curr_col = column;
            row -=1;
            column +=1;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if(magicSquare[row][column] != 0) {
                row = curr_row + 1;
                column = curr_col;
                if(row == -1) {
                    row = n - 1;
                }
            }
        }
    }

    private static void shoMagicSquare() {
        for(int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                System.out.println(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void checkIfMagicSquare() {
        if(sumRow() == sumCol()) {
            System.out.println("Is magic square");
        } else  {
            System.out.println("is not magic square");
        }
    }

    private static int sumRow() {
        int sum = 0;
        for (int i = 0; i < magicSquare.length; i ++) {
            for (int j = 0; j < magicSquare.length; j ++) {
                sum = sum + magicSquare[i][j];
            }
        }
        return sum;
    }

    private static int sumCol() {
        int sum = 0;
        for (int j = 0; j < magicSquare.length; j ++) {
            for (int i = 0; i < magicSquare.length; i ++) {
                sum = sum + magicSquare[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        generateMagicSquare();
        shoMagicSquare();
        checkIfMagicSquare();
    }
}
