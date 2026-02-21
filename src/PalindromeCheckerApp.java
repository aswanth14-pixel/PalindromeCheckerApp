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

    }
}
