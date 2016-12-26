package Task2;


/**
 * Created by tmoiseev on 12/12/2016.
 */
public class Palindrom {

    private static String string = "CABAc";
    private static String string2 = "";

    public static void main(String[] args) {
        String string1 = string.replaceAll(" ", "");

        invertString(string1);
        isPalindorm(string1, string2);
    }


    private static void isPalindorm(String string1, String string2) {
        if(string1.equalsIgnoreCase(string2)) {
            System.out.println("palindrom");
        } else  {
            System.out.println("no palindrom");
        }
    }


    private static String invertString(String string1) {
        char[] charArray = string1.toCharArray();

        System.out.println(string1);
        int end = charArray.length - 1;

        for (int i = 0; i < charArray.length / 2; i ++) {
            char tmp = charArray[i];
            charArray[i] = charArray[end];
            charArray[end] = tmp;
            end -- ;
        }

        for (int i = 0; i < charArray.length; i ++) {
            string2 += Character.toString(charArray[i]);
        }

        System.out.println(charArray);
        return string2;
    }
}
