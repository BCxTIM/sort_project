package Task2;

/**
 * Created by tmoiseev on 12/26/2016.
 */
public class Task14 {
    private static int coins[] = {1, 3, 10, 25, 50};

    private static int minCoins(int coins[], int value) {
        if (value == 0) return 0;

        int res = 100;

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= value) {
                int tempRes = minCoins(coins, value - coins[i]);

                if (tempRes != res && tempRes + 1 < res) {
                    res = tempRes + 1;
                }
            }
        }
        return res;
    }


    public static void main(String args[]) {
        int value = 5;
        int res =  minCoins(coins, value);
        System.out.println("Minimum coins  " + res);
    }

}
