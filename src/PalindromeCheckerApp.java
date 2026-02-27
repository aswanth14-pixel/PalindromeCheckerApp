public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";


        String normalized = input
                .toLowerCase()                 // ignore case
                .replaceAll("\\s+", "");       // remove spaces


        boolean isPalindrome = isPalindrome(normalized);

        System.out.println("Original Input : " + input);
        System.out.println("Normalized     : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    private static boolean isPalindrome(String str) {

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