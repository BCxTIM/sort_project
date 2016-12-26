package Task2;

import Task1.Array.Array;

/**
 * Created by tmoiseev on 12/12/2016.
 */
public class Task5 extends Array {

    public static void main(String[] args) {
        generateArray();
        showArray();

        int countEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                countEven ++;
            } else {
                sumOdd += array[i];
            }

        }

        System.out.println("Count of even elements = " + countEven);
        System.out.println("Sum of odd elements = " + sumOdd);
    }
}
