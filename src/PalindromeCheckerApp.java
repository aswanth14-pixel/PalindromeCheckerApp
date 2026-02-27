public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        // Create service object
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

class PalindromeChecker {

    // Public method exposed to client
    public boolean checkPalindrome(String str) {

        if (str == null) {
            return false;
        }

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}