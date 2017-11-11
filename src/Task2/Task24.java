package Task2;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tmoiseev on 9/26/2017.
 */
public class Task24 {
    public static int row = 0;
    public static int column = 0;
    public static ArrayList<Map<Point, Integer>> way = new ArrayList<>();
    public static ArrayList<Map<Point, Integer>> tempWay = new ArrayList<>();
    public static ArrayList<Map<Point, Integer>> fixedWay = new ArrayList<>();

//    public static Map<Point, Integer> tempMap = new HashMap<>();

    public static int cheers = 0;

    //TODO
    // Два метода вправо и вниз
    // Проверки: если вправо стена - то вниз
    //          если вправо и вниз стена - то возвращаемся на предудыщее разветвление
    //          если вниз стена - то вверх
//                ессли вправо вишни - то идем вправо
//                 если вниз вишни - то идем вниз
//                  если вправо и вниз вишни - то идем влево и сохраняем точку разветвления
//                    если вправо и вниз нули - то идем влево и сохраняем точку разветвления
//                  после прохода массива проверяем - если были точки развтвления - то идем по другому пути
//                  если не попали в нижнюю правую точку после прохода всех путей - то сообщение что не можем выйти из лабиринта
//                  поворот из каждой точки запоминаем в Map где ключ  это точка а значение - это поворот в какую сторону идти надо
//                  счетчик вишенок
//                  выполнять программу пока не пройдутся все пути


    public static void main(String[] args) {
        moving();

        for (int i = 0; i < tempWay.size(); i++) {
            Map<Point, Integer> tempMap = tempWay.get(i);
            for (Map.Entry<Point, Integer> entry : tempMap.entrySet()) {
                row = (int) entry.getKey().getX() + 1;
                column = (int) entry.getKey().getY();
                cheers = entry.getValue();
                checkCheers();
            }
            moving();
        }

        showWay();
        System.out.println(cheers);

    }

    public static void addFixedWay() {
        int tempCheers = 0;
        ArrayList<Map<Point, Integer>> t = new ArrayList<>();
        for (int i = 0; i < way.size(); i++) {
            t.add(way.get(i));
        }
        if (!fixedWay.isEmpty()) {
            Map<Point, Integer> m = fixedWay.get(fixedWay.size() - 1);
            for (Map.Entry<Point, Integer> entry : m.entrySet()) {
                tempCheers = entry.getValue();
            }
            if (cheers > tempCheers) {
                t.removeAll(fixedWay);
                fixedWay.addAll(t);
            }
        } else {
            fixedWay.addAll(way);
        }

    }

    public static void showWay() {
        for (int i = 0; i < fixedWay.size(); i++) {
            System.out.println(fixedWay.get(i));
        }
    }


    public static void goRight() {
        column = column + 1;
    }

    public static void goBottom() {
        row = row + 1;
    }

    public static int[][] matrix = {
            {0, 0, 2, 0, 0},
            {2, 1, 0, 1, 2},
            {0, 2, 0, 2, 0},
            {1, 1, 2, 0, 0},
            {1, 1, 0, 2, 0},
    };

    public static void addWay(Map<Point, Integer> tempMap) {
        way.add(tempMap);
    }

    public static void moving() {

        while ((row != (matrix.length - 1)) && (column != (matrix.length - 1))) {
            if (matrix[row][column + 1] == 1) {
                if (matrix[row + 1][column] == 1) {
                    System.out.println("Can't exit from labirint");
                    System.out.println("Row is " + row + " and column is " + column);
                    break;
                } else {
                    goBottom();
                    checkCheers();
                    Map<Point, Integer> tempMap = new HashMap<>();
                    tempMap.put(new Point(row, column), cheers);
                    addWay(tempMap);
                }
            } else {
                if (matrix[row + 1][column] == 1) {
                    goRight();
                    checkCheers();
                    Map<Point, Integer> tempMap = new HashMap<>();
                    tempMap.put(new Point(row, column), cheers);
                    addWay(tempMap);
                } else {
                    Map<Point, Integer> tempMap = new HashMap<>();
//                    tempMap.put(new Point(row, column), cheers);
                    goRight();
                    tempWay.add(tempMap);
                    checkCheers();
                    tempMap.put(new Point(row, column), cheers);
                    addWay(tempMap);
                    addFixedWay();
                }

            }
        }

    }

    public static void checkCheers() {
        if (matrix[row][column] == 2) {
            cheers++;
        }
    }


}
