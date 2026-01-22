package starQs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
    /**
     * Reverse a string by preserving word position
     */
    public static void main(String[] args) {
        String input = "I love Java";

        String collect = Arrays.stream(input.split(" "))
                .map(c->new StringBuilder(c).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
