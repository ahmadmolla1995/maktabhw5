package DisplayPersonsList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReduceExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 8, 40, 10, -1, 20, 35));
        numbers.stream().reduce(Integer::sum).ifPresent(System.out::println);
    }
}
