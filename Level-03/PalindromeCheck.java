
import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        boolean isPalindrome1 = isPalindromeIterative(text);
        boolean isPalindrome2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean isPalindrome3 = isPalindromeCharArray(text);

        System.out.println("Is Palindrome (Iterative): " + isPalindrome1);
        System.out.println("Is Palindrome (Recursive): " + isPalindrome2);
        System.out.println("Is Palindrome (CharArray): " + isPalindrome3);

        scanner.close();
    }

    // Logic 1: Iterative Approach
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (Character.toLowerCase(text.charAt(start)) != Character.toLowerCase(text.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive Approach
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (Character.toLowerCase(text.charAt(start)) != Character.toLowerCase(text.charAt(end))) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Character Array Approach
    public static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (Character.toLowerCase(original[i]) != Character.toLowerCase(reversed[i])) {
                return false;
            }
        }
        return true;
    }

    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }
}