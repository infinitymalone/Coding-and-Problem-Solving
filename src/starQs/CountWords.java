package starQs;

import java.util.Arrays;

public class CountWords {
    /**
     * Count Words in a string
     */
    public static void main(String[] args) {
        String input = "Hello World";
            System.out.println(input.trim().split("\\s").length);
    }
}
