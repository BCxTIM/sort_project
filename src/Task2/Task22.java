package Task2;


import java.awt.*;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by tmoiseev on 3/9/2017.
 */
public class Task22 {

    private static ArrayList<Point> points = new ArrayList<>();
    private static ArrayList<Point> resPoints = new ArrayList<>();

    public static void main(String[] args) {
        points.add(new Point(1, 1));
        points.add(new Point(4, 3));
        points.add(new Point(2, 0));
        points.add(new Point(2, 2));
        points.add(new Point(4, 1));
        points.add(new Point(3, 2));
        points.add(new Point(3, 4));
        points.add(new Point(1, 3));
        points.add(new Point(2, 3));

        findFirstPointToConvexPolygon();
        convexPolygon();
        showConvexPolygon();

        for(int i = 0; i < resPoints.size(); i ++) {
            System.out.println(resPoints.get(i));
        }


        System.out.print(String.format("Perimeter max figure is: [%s]", perimeter(resPoints)));

    }

    public static void convexPolygon() {


        for (int index = 0; index < resPoints.size(); index++) {

            Point start;
            if (resPoints.size() == 1) {
                start = new Point(0, 0);
            } else {
                start = resPoints.get(index - 1);
            }

            int pos = 0;
            double tmp = findAngle(start, resPoints.get(index), points.get(0));
            for (int i = 1; i < points.size() ; i ++) {

                if(tmp < findAngle(start, resPoints.get(index), points.get(i))) {
                    tmp = findAngle(start, resPoints.get(index), points.get(i));
                    pos = i;
                }

            }

            //проверка на замкнутость
            if(resPoints.size() > 1) {
                if(tmp >= findAngle(start, resPoints.get(index), resPoints.get(0))) {
                    addPointInResArray(pos);
                } else {
                    break;
                }
            } else {
                addPointInResArray(pos);
            }

        }


    }

    public static double findAngle(Point start, Point middle, Point next) {
        double x1 = start.x - middle.x, x2 = next.x - middle.x;
        double y1 = start.y - middle.y, y2 = next.y - middle.y;
        double pow = x1 * x2 + y1 * y2;
        double d1 = Math.sqrt(x1 * x1 + y1 * y1);
        double d2 = Math.sqrt(x2 * x2 + y2 * y2);

        return Math.toDegrees((Math.acos((pow) / (d1 * d2))));
    }


    public static void showConvexPolygon() {
        for(int i = 0; i < resPoints.size(); i ++) {
            System.out.println(resPoints.get(i));
        }
    }

    public static Point findFirstPointToConvexPolygon() {
        int m = 0;
        for (int i = 1; i < points.size(); i++) {
            if (points.get(i).getY() < points.get(m).getY()) {
                m = i;
            } else if (points.get(i).getY() == points.get(m).getY() && points.get(i).getX() > points.get(m).getY()) {
                m = i;
            }
        }
        addPointInResArray(m);

        return resPoints.get(0);
    }

    private static void addPointInResArray(int index) {
        resPoints.add(points.get(index));
        points.remove(index);
    }


    private static double perimeter(ArrayList<Point> figure) {
        double[] length = new double[figure.size()];

        //расстояние находим
        for (int  i = 0; i < figure.size(); i ++ ) {
            if(i == figure.size() - 1) {
                length[i] = roundDownScale(figure.get(i).distance(figure.get(0)));
            } else {
                length[i] = roundDownScale(figure.get(i).distance(figure.get(i + 1)));
            }

        }

        return getPerimiter(length);

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
