package Task2;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tmoiseev on 12/28/2016.
 */
public class Task18 {

    private static ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    private static int p = 3;
    private static int pos = p;

    public static void main (String[] args) throws java.lang.Exception  {
        System.out.println(arrayList);
        computeArrayList(arrayList, pos);
    }

    private static ArrayList<Integer> computeArrayList(ArrayList<Integer> tmpArrayList, int pos) {

        while (tmpArrayList.size() != 1){
            if (pos > tmpArrayList.size()) {
                return computeArrayList(tmpArrayList, pos - tmpArrayList.size());
            }

            tmpArrayList.remove(pos - 1);
            System.out.println(arrayList);
            return computeArrayList(tmpArrayList, p + pos - 1);
        }

        return tmpArrayList;

    }
}
