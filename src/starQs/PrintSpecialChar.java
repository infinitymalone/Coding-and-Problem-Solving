package starQs;

import java.util.List;
import java.util.stream.Collectors;

public class PrintSpecialChar {
    /**
     * Print only special character in a string
     */
    public static void main(String[] args) {
        String input = "ihdbehibibc%%&&@@";
        List<Character> collect = input.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .filter(c -> !Character.isLetterOrDigit(c))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
