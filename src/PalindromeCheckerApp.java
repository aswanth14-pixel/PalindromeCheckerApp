public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        boolean isPalindrome = isPalindromeRecursive(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    // Recursive method
    private static boolean isPalindromeRecursive(String str, int start, int end) {

        // Base Case 1: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call shrinking the problem
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}