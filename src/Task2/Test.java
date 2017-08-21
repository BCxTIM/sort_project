package Task2;


import com.sun.javafx.geom.Vec2d;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by tmoiseev on 7/20/2017.
 */
public class Test {

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

//        showArray();

        findFirstPoint();

        findNextPoint();

        for(int i = 0; i < resPoints.size(); i ++) {
            System.out.println(resPoints.get(i));
        }


    }

    public static void findNextPoint() {


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


    public static void showArray() {
        for (Point point : points) {
            System.out.println(point);
        }
    }

    public static Point findFirstPoint() {
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


}
