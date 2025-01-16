import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        char firstNonRepeatingChar = findFirstNonRepeatingChar(str);

        if (firstNonRepeatingChar != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }

    public static char findFirstNonRepeatingChar(String str) {
        int[] charFrequency = new int[256]; // Array to store character frequencies

        // Calculate character frequencies
        for (int i = 0; i < str.length(); i++) {
            charFrequency[str.charAt(i)]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (charFrequency[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '\0'; // No non-repeating character found
    }
}