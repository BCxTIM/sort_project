package Task2;


import java.awt.*;
import java.math.BigDecimal;

/**
 * Created by tmoiseev on 3/9/2017.
 */
public class Task22 {


    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(1, 5);
        Point c = new Point(4, 5);
        Point d = new Point(4, 1);
        Point m = new Point(2, 2);
//



        Point[] figure = {a, b, c, d, m};
//        contur(figure);
        distance(figure);

    }




    private static void contur1(Point[] figure) {
        int[] x = new int[figure.length];
        int[] y = new int[figure.length];

        int n = figure.length;

        for(int i = 0; i < figure.length; i ++) {
            x[i] = (int)figure[i].getX();
            y[i] = (int)figure[i].getY();
        }

//        Polygon polygon = new Polygon(x, y, n);

    }

    private static void distance(Point[] figure) {
        double[] length = new double[figure.length];

        for (int  i = 0; i < figure.length; i ++ ) {


            if(i == figure.length - 1) {
                length[i] = roundDownScale(figure[i].distance(figure[0]));
            } else {
                length[i] = roundDownScale(figure[i].distance(figure[i + 1]));
            }

            System.out.println(length[i]);

        }

        System.out.println(getPerimiter(length));

    }

    private static double getPerimiter(double[] length) {
        double perimiter = 0;
        for (int i = 0; i < length.length; i ++) {
            perimiter += length[i];
        }
        return perimiter;
    }

    public static double roundDownScale(double aValue)
    {
        BigDecimal decimal = new BigDecimal(aValue);
        decimal = decimal.setScale(1,BigDecimal.ROUND_DOWN);
        double result = decimal.doubleValue();
        return result;
    }







}
