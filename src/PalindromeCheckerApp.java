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
    }
}
