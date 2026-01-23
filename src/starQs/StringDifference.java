package starQs;

public class StringDifference {
    /**
     * Print Difference b/w two Strings
     */

    //NOTE: THE BELOW HANDLING IS ONLY WHEN BOTH THE STRINGS HAVE SAME LENGTH.
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "anc2";

        int len = str2.length();

        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                System.out.println("Difference at Position : " + (i + 1) + ", Of the characters [ " + str1.charAt(i) + " VS " + str2.charAt(i) + " ]");
            }
        }
    }
}
