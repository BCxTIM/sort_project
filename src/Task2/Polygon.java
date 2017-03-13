package Task2;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by tmoiseev on 3/11/2017.
 */
public class Polygon {
    private ArrayList<Point.Double> points;

    public static void main(String[] args) {
        Polygon poly = new Polygon();
        poly.add(1, 1);
        poly.add(4, 1);
        poly.add(1, 4);
        poly.add(4, 4);
        poly.add(2, 2);
        System.out.println(poly.perimeter());
    }


    public Polygon() {
        points = new ArrayList<>();
    }

    public void add(double x, double y) {
        points.add(new Point.Double(x, y));
    }
    public int perimeter() {


        if (points.size() < 2) {
            return 0;
        }

        int i = 0;
        int d = 0;
        int total = 0;

        while (i < points.size()) {
            Point.Double point1;
            Point.Double point2;

            if (i == points.size() - 1) {
                point1 = points.get(i);
                point2 = points.get(0);
            } else {
                point1 = points.get(i);
                point2 = points.get(i + 1);
            }


            d = (int) point1.distance(point2);
            System.out.println(d);
            total = total + d;
            i++;

        }
        return total;

    }

}
