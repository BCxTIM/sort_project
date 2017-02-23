package Task2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by tmoiseev on 1/27/2017.
 */
public class TestTask {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.forEach(System.out::println);

        System.out.println(sumAll(numbers, n -> n > 3));
        List<Integer> numbers1 = numbers;


    }

    public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
        for (int number: numbers) {
            if(p.test(number)) {
                total += number;
            }
        }
        return total;
    }
}
