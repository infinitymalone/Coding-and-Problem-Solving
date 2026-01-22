package starQs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupes {
    /**
     * Remove duplicates from an Array / String / List
     */

    public static void main(String[] args) {
        // 1. Array or List
        Integer[] arr = {1, 1, 2, 2, 3, 3, 4, 4};
        List<Integer> nums = Arrays.asList(arr);

        List<Integer> collect = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

        // 2. String
        String input = "aaabb";
        String collect1 = input.chars().mapToObj(c -> String.valueOf((char) c)).distinct().collect(Collectors.joining());
        System.out.println(collect1);

    }
}
