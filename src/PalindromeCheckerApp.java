public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Level";

        long startTime = System.nanoTime();

        boolean isPalindrome = isPalindrome(input);

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }

    private static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (Character.toLowerCase(str.charAt(start)) !=
                    Character.toLowerCase(str.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}