package Task2;

import java.util.Scanner;

/**
 * Created by tmoiseev on 12/12/2016.
 */
public class Task6 {

//    private static int n = 400;
//    private static double pi = Math.PI;
//
//    //формула числа пи TODO
//
//    public static void main(String[] args) {
//        showPi();
//    }
//
//    private static void showPi() {
//        String formattedDouble = String.format("%."+ n + "f", pi);
//        System.out.println(formattedDouble);
//    }

    public static void main(String[] args) {
        Double t;// точность
        Double p; //значение пи
        Double n; // число членов ряда
        Double chr; // значение члена ряда

        chr = 1.0D;
        n = 1.0D;
        p = 0.0D;
        System.out.print("Задайте точность вычисления ПИ -> ");
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextDouble();
        System.out.println(t);
        while (t < Math.abs(chr)) {
            p += chr;

            //chr = (float) (Math.pow(-1, (1 + n))) * (1 / (2 * n - 1));
            chr = ((Math.pow(-1,  n)) * (1 / ((2 * n) + 1)));
            n++;
        }
        p = p * 4;

        System.out.printf("Значение числа ПИ с точностью %1.6f равно %1.6f\n", t, p);

        System.out.println("Количество членов ряда " + n);
        System.out.printf(" %3.6f\n ", chr);

    }
}
