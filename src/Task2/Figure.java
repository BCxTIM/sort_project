package Task2;


import java.awt.*;
import java.util.ArrayList;

/**
 * Created by tmoiseev on 5/5/2017.
 */
public class Figure {

    private ArrayList<Point> points;

    Figure() {
        points = new ArrayList<>();
    }

    public void add(int x, int y) {
        points.add(new Point(x, y));
    }


    public Point get(int index) {
        return points.get(index);
    }

    public void print() {
        for (Point p : points)
            System.out.println("(" + p.x + "," + p.y + ")");
    }

    public int length() {
        return points.size();
    }

    public boolean isIntersect(int x, int y, Point p1, Point p2) {
        int dy1 = p1.y - y;
        int dy2 = p2.y - y;

        if (Math.signum(dy1) == Math.signum(dy2))
            return false;

        int dx1 = p1.x - x;
        int dx2 = p2.x - x;

        if (dx1 >= 0 && dx2 >= 0)
            return true;

        if (dx1 < 0 && dx2 < 0)
            return false;

        int dx0 = dy1 * (p1.x - p2.x) / (p1.y - p2.y);

        return dx0 <= dx1;
    }

    public boolean isInside(int x, int y) {
        int intersect_count = 0;
        for (int i = 0; i < points.size(); i++) {
            Point p1 = points.get(i > 0 ? i - 1 : points.size() - 1);
            Point p2 = points.get(i);

//            System.out.println("(" + p1.x + "," + p1.y + ")-(" + p2.x + "," + p2.y + ") => " + isIntersect(x, y, p1, p2));

            if (isIntersect(x, y, p1, p2))
                intersect_count++;
        }

        return intersect_count % 2 == 1;
    }

    public void test(Figure a) {
        Figure b = new Figure();

        for (int i = 0; i <= 2; i++) {
            b.add(a.get(i).x, a.get(i).y);
        }


        for (int i = 3; i < a.length(); i++) {
            if (!b.isInside(a.get(i).x, a.get(i).y)) {
                b.add(a.get(i).x, a.get(i).y);
            }
        }


        b.print();
    }

    public static void main(String[] args) {
        Figure a = new Figure();
        a.add(0, 5);
        a.add(0, 0);
        a.add(5, 5);
        a.add(2, 7);
        a.add(2, 6);


        a.test(a);
    }


}
