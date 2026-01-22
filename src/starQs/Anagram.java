package starQs;

import java.util.stream.Collectors;

public class Anagram {
    /**
     * Check if two strings are anagrams
     */
    public static void main(String[] args) {
        String str1 = "SIlENT", str2= "LISTEN";
        String collect1 = str1.toLowerCase().chars().mapToObj(c -> String.valueOf((char) c)).sorted().collect(Collectors.joining());
        String collect2 = str2.toLowerCase().chars().mapToObj(c -> String.valueOf((char) c)).sorted().collect(Collectors.joining());
        System.out.println("str 1--> " + collect1);
        System.out.println("str 2--> " + collect1);
        System.out.println(collect1.equals(collect2));
    }
}
