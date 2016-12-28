package Task2;

/**
 * Created by tmoiseev on 12/20/2016.
 */
public class Task9 { //оптимизация - устранить поовторяющиеся числа

    private static int n = 10000;

    private static int sum(int i) {
        int res = 0;
        for (int j = 1; j <= i / 2; j++) {
            if (i % j == 0) {
                res += j;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println("All friendly number pairs, smaller than " + n + " is: ");
        for (int i = 1; i <= n; i++) {
            if (sum(sum(i)) == i) {
                System.out.println(i + " and " + sum(i));
            }
        }
    }
}


//TODO оптимизация
/*if(i != sum(i)) {
        System.out.println(i + " and " + sum(i));
}*/
