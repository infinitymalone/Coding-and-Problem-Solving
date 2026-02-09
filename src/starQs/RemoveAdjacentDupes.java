package starQs;

import java.util.Stack;

public class RemoveAdjacentDupes {
    public static void main(String[] args) {
        String input = "abbac";
        // output --> c
        // a b b a c
        // a a c
        // c

        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack);

    }
}
