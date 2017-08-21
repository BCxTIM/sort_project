package Task2;

import java.awt.*;

/**
 * Created by tmoiseev on 7/30/2017.
 */
public class Test1 {

    public static void main(String[] args) {
        findAngle(new Point(2,0), new Point(4,1), new Point(1, 1));
    }

    public static void findAngle(Point start, Point middle, Point next) {
        double x1 = start.x - middle.x, x2 = next.x - middle.x;
        double y1 = start.y - middle.y, y2 = next.y - middle.y;
        double pow = x1 * x2 + y1 * y2;
        double d1 = Math.sqrt(x1 * x1 + y1 * y1);
        double d2 = Math.sqrt(x2 * x2 + y2 * y2);

        System.out.print( Math.toDegrees((Math.acos((pow) / (d1 * d2) ))));
        //116.56505117707799


    }
}
