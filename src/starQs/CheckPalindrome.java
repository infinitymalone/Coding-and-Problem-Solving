package starQs;

import java.util.stream.Collectors;

public class CheckPalindrome {
    /**
     * Check if a string is Palindrome
     */

    public static void main(String[] args) {

        // Streams
        String input = "A man, a plan, a canal: Panama";

        System.out.println(input.toLowerCase().replaceAll("[^a-z0-9]", "").chars().mapToObj(x -> String.valueOf((char) x)).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).reverse().toString().equals(input.toLowerCase().replaceAll("[^a-z0-9]", "")));

        // Easy Way
        String str = new StringBuilder(input.toLowerCase().replaceAll("[^a-z0-9]", "")).reverse().toString();
        System.out.println(str.equals(input.toLowerCase().replaceAll("[^a-z0-9]", "")));

        // Two Pointers
        String str1 = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println(isPalindrome(str1));

    }

    public static boolean isPalindrome(String str1) {
        int left = 0, right = str1.length() - 1;

        while (left < right) {
            if (str1.charAt(left) != str1.charAt(right)) {
//                System.out.println("Not Palindrome");
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
