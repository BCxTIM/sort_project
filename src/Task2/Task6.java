package Task2;

/**
 * Created by tmoiseev on 12/12/2016.
 */
public class Task6 {

    private static int n = 400;
    private static double pi = Math.PI;

    //формула числа пи TODO

    public static void main(String[] args) {
        showPi();
    }

    private static void showPi() {
        String formattedDouble = String.format("%."+ n + "f", pi);
        System.out.println(formattedDouble);
    }
}
