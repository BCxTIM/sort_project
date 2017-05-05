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

    public void add(Point point) {
        points.add(point);
    }


    public Point get(int index) {
        return points.get(index);
    }

    public void print() {
        for (Point p : points)
            System.out.println("(" + p.x + "," + p.y + ")");
    }

    public void remove(int index) {
        points.remove(index);
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

    public void findPerimetr(Figure a) {
        Figure b = contur(a);

        distance(b);
        System.out.println(getPerimiter(b));
    }

    public Figure contur(Figure a) {
        Figure b = new Figure();

        for (int i = 0; i <= 2; i++) {
            b.add(a.get(i));
        }

        for (int i = 3; i < a.length(); i++) {
            if (!b.isInside(a.get(i).x, a.get(i).y)) {
                b.add(a.get(i));
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Figure a = new Figure();
        a.add(new Point(0, 5));
        a.add(new Point(0, 0));
        a.add(new Point(5, 5));
        a.add(new Point(2, 6));
        a.add(new Point(2, 7));

        a.findPerimetr(a);
    }


    private static int[] distance(Figure figure) {
        int[] length = new int[figure.length()];

        for (int  i = 0; i < figure.length(); i ++ ) {


            if(i == figure.length() - 1) {
                length[i] = (int) figure.get(i).distance(figure.get(0));
            } else {
                length[i] = (int) figure.get(i).distance(figure.get(i+1));
            }

        }
        return length;

    }

    private static int getPerimiter(Figure b) {
        int[] length = distance(b);
        int perimiter = 0;
        for (int i = 0; i < length.length; i ++) {
            System.out.println(length[i]);
            perimiter += length[i];
        }
        return perimiter;
    }



}
