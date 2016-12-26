package Task2;

/**
 * Created by tmoiseev on 12/24/2016.
 */
public class Task10 {

    private static int k = 3;
    private static int curYear = 2016;
    private static int j = 0;

    private static void verifyLeapYear(int year) {

        if(j < k) {
            if ((year % 4 == 0) && year % 100 != 0) {
                System.out.println(year);
                j++;
            } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                System.out.println(year);
                j++;
            }
        }
    }

    private static void findLeapYear() {
        for (int i = curYear + 1; i < 2200; i++) {
            verifyLeapYear(i);
        }
    }


    public static void main(String[] args) {

        System.out.println("Following " + k + " leap years is:");
        findLeapYear();
    }
}
