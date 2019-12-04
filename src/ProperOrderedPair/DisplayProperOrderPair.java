package ProperOrderedPair;

import java.util.ArrayList;
import java.util.Arrays;


public class DisplayProperOrderPair {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1));
        System.out.println(removeInAppropriateOrderedPairs(numbers));
    }

    private static ArrayList<Integer> removeInAppropriateOrderedPairs(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size() - 1; i += 2) {
            if (numbers.get(i) <= numbers.get(i + 1)) {
                result.add(numbers.get(i));
                result.add(numbers.get(i + 1));
            }
        }

        return result;
    }
}
