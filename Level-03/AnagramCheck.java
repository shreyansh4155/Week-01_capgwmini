import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        boolean areAnagrams = areAnagrams(text1, text2);

        if (areAnagrams) {
            System.out.println(text1 + " and " + text2 + " are anagrams.");
        } else {
            System.out.println(text1 + " and " + text2 + " are not anagrams.");
        }

        scanner.close();
    }

    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false; // If lengths are different, they can't be anagrams
        }

        int[] charFrequency1 = new int[256];
        int[] charFrequency2 = new int[256];

        // Calculate character frequencies for text1
        for (int i = 0; i < text1.length(); i++) {
            charFrequency1[text1.charAt(i)]++;
        }

        // Calculate character frequencies for text2
        for (int i = 0; i < text2.length(); i++) {
            charFrequency2[text2.charAt(i)]++;
        }

        // Compare character frequencies
        for (int i = 0; i < 256; i++) {
            if (charFrequency1[i] != charFrequency2[i]) {
                return false; // If frequencies differ, they are not anagrams
            }
        }

        return true; // If all frequencies match, they are anagrams
    }
}