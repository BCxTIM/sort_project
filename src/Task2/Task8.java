package Task2;

/**
 * Created by tmoiseev on 12/20/2016.
 */
public class Task8 {
    private static int n = 20;

    public static void main(String[] args) {
        boolean f = false;
        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                System.out.println("Prime number " + i + " smaller than " + n);
                if (i < n) {
                    f = true;
                }
            }
        }
        if (f) {
            System.out.println("All prime numbers smaller than " + n);
        }
    }
}
