package Task2;



/**
 * Created by tmoiseev on 11/28/2016.
 */
public class Task3InverseArray  {

    //TODO в качестве оптимизации можно использовать метод для генерации array а для начала использовать массив с созданными данными

    private static float array[] = new float[5];

    private static void generateArray(float[] array) {
        for(int i = 0; i < array.length; i++)
            array[i] = (float) Math.random();
    }

    private static void showArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    public static void main(String[] args) {

        generateArray(array);
        showArray();

//        int end = array.length - 1;

        for (int i = 0; i < array.length - i - 1; i++) {
//            float tmp = array[i];
//            array[i] = array[end];
//            array[end] = tmp;
//            end--;
            array[i] = array[i] + array[array.length - i - 1] - (array[array.length - i - 1] = array[i]); //оптимизированный метод
//            end --;
        }
        System.out.println("");

        showArray();
    }

    //TODO вместо end (-i)
    //TODO найти метод ддля свопа


}
