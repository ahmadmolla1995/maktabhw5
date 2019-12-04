package DisplayPersonsList;

import java.util.ArrayList;
import java.util.Arrays;

public class PeekExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7, 5, 8, 2, 0, 3));
        System.out.println(numbers.stream().peek(System.out::println));
        System.out.println(numbers.stream().peek(System.out::println).count());
    }
}
