package starQs;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortAnArray {
    public static void main(String[] args) {
        // Easy way
        Integer[]arr={2,32,42334,34,36};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // Streams
        List<Integer> collect = Arrays.asList(2112, 23, 22, 2, 22, 3).stream().sorted().collect(Collectors.toList());
        System.out.println(collect);


    }
}
