package DisplayPersonsList;

import java.util.ArrayList;
import java.util.Arrays;

public class AnyMatchExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7, 8, 2, 10, 11, 13, 15, 16));
        boolean answer = numbers.stream().anyMatch(n -> n %3 == 0);
        System.out.println(answer);
    }
}
