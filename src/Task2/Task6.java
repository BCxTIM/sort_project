package Task2;


/**
 * Created by tmoiseev on 12/12/2016.
 */
public class Task6 {


    public static void main(String[] args) {
        int inCount = 0;
        int count = 2000000;
        double x;
        double y;
        double result;
        for (int i = 0; i < count; i++) {
            x = (Math.random() *2) - 1;
            y = (Math.random() *2) - 1;
            if(Math.pow(x, 2) + Math.pow(y, 2) <=1 ) {
                inCount ++;
            }
        }

        result = (double)4*inCount/count;
        System.out.println(result);
    }
}
