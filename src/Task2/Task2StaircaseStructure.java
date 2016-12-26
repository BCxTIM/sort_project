package Task2;


/**
 * Created by tmoiseev on 12/12/2016.
 */
public class Task2StaircaseStructure {

    private static int n = 6;
    public static void main(String[] args) {
        staircaseStructure(n);
    }

    private static void staircaseStructure(int n) {
        for (int i = 1; i <=n; i++) {
            System.out.println(String.format("%"+i+"s", "").replace(' ', '#'));
        }
    }
}
