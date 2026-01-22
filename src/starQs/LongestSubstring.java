package starQs;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    /**
     * Find the longest substring length without repeating characters
     */

    public static void main(String[] args) {
        String input = "abcbbaa"; // 3
        int max = 0, left = 0, right = 0;
        Set<Character> subChar = new HashSet<>();
        for (right = 0; right < input.length(); right++) {
            while (subChar.contains(input.charAt(right))) {
                subChar.remove(input.charAt(right));
                left++;
            }
            subChar.add(input.charAt(right));
            max = Math.max(max, right - left + 1);


        }

        System.out.println(max);
    }
}
