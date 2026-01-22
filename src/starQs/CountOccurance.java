package starQs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurance {
    /**
     * Count Occurrence of characters in a string
     */
    public static void main(String[] args) {
        String input = "Java";
        Map<Character, Long> collect = input.toLowerCase().chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
