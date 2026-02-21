import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ===== UC1: Application Entry =====

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        // ===== UC2 =====
        String input1 = "madam";
        boolean isPalindrome1 = true;

        for (int i = 0; i < input1.length() / 2; i++) {
            if (input1.charAt(i) != input1.charAt(input1.length() - 1 - i)) {
                isPalindrome1 = false;
                break;
            }
        }

        System.out.println("UC2 Result : " + isPalindrome1);
        System.out.println();

        // ===== UC3 =====
        String input2 = "madam";
        String reversed = "";

        for (int i = input2.length() - 1; i >= 0; i--) {
            reversed = reversed + input2.charAt(i);
        }

        System.out.println("UC3 - Original Text : " + input2);
        System.out.println("UC3 - Reversed Text : " + reversed);

        if (input2.equals(reversed)) {
            System.out.println("UC3 - Result : It is a Palindrome");
        } else {
            System.out.println("UC3 - Result : It is NOT a Palindrome");
        }

        // ===== UC4 =====
        String input3 = "radar";
        char[] chars = input3.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome3 = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome3 = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("UC4 Input : " + input3);
        System.out.println("UC4 Result : " + isPalindrome3);

        // ===== UC5 =====
        String input4 = "noon";

        Stack<Character> stack = new Stack<>();

        for (char c : input4.toCharArray()) {

            stack.push(c);

        }
        boolean isPalindrome4 = true;

        for (char c : input4.toCharArray()) {

            if (c != stack.pop()) {

                isPalindrome4 = false;

                break;

            }
        }
        System.out.println("UC5 Input : " + input4);
        System.out.println("UC5 Result : " + isPalindrome4);

        // ===== UC6 =====
        String input = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack_uc6 = new Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
            stack_uc6.push(c);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack_uc6.pop()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        // ===== UC7 =====
        String input7 = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input7.toCharArray()) {
            deque.addLast(c);
        }
        boolean isPalindrome7 = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome7 = false;
                break;
            }
        }
        System.out.println("UC7 Input : " + input7);
        System.out.println("UC7 Result : " + isPalindrome7);
    }
}
