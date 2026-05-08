/**
 * Main.java
 * Entry point for the TextUtils Java utility tool.
 * Demonstrates all available utility functions.
 *
 * SWE 442 — Software Configuration Management
 * Group Project — Version Control and Release Management
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== TextUtils Java Utility Tool ===\n");

        // Demo: reverseString
        String word = "Hello, World!";
        System.out.println("Original:        " + word);
        System.out.println("Reversed:        " + TextUtils.reverseString(word));
        System.out.println();

        // Demo: countWords
        String sentence = "Software configuration management is important";
        System.out.println("Sentence:        " + sentence);
        System.out.println("Word count:      " + TextUtils.countWords(sentence));
        System.out.println();

        // Demo: isPalindrome
        String[] tests = {"racecar", "hello", "A man a plan a canal Panama"};
        for (String test : tests) {
            System.out.println("\"" + test + "\" is palindrome: " + TextUtils.isPalindrome(test));
        }
    }
}
