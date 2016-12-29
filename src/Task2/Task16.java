package Task2;

/**
 * Created by tmoiseev on 12/27/2016.
 */
public class Task16 {
    private static int n = 10;
    private static int i = 1;

    public static void main(String[] args) {
        int moves = 0;

        while (n != i) {
            if(n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }
            moves ++;
        }
        System.out.println(moves);
    }
}
