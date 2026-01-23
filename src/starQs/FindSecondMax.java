package starQs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondMax {
    public static void main(String[] args) {
        //  Streams
        List<Integer> nums = Arrays.asList(7, 8, 5, 4, 88);
        Integer i = nums.stream().distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElse(-1);
        System.out.println(i);


        // No Sorting (Recommended)
        int max = Integer.MIN_VALUE, min = Integer.MIN_VALUE;
        Integer[] arr = nums.toArray(new Integer[0]);
        for(int a : arr){
            if(a > max){
                min = max;
                max = a;
            }else if(a > min && a != max){
                min = a;
            }

        }
        System.out.println("Second Largest--> "+min);
    }
}
