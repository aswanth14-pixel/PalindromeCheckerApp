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

    }
}
