/**
 * TextUtils.java
 * A simple Java utility tool for common text/string operations.
 *
 * SWE 442 — Software Configuration Management
 * Group Project — Version Control and Release Management
 */
public class TextUtils {

    /**
     * Reverses the characters of a given string.
     *
     * @param input the string to reverse
     * @return the reversed string
     */
    public static String reverseString(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Counts the number of words in a given string.
     * Words are separated by one or more whitespace characters.
     *
     * @param input the string to count words in
     * @return the number of words
     */
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) return 0;
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    /**
     * Checks if a given string is a palindrome (reads the same forwards and backwards).
     * The check is case-insensitive and ignores spaces.
     *
     * @param input the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
    public static String toLowerCase(String input) {
    if (input == null) return null;
    return input.toLowerCase();
}
}
