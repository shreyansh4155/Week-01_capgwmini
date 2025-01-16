import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        String[][] charFrequencies = findCharacterFrequencies(str);

        displayCharacterFrequencies(charFrequencies);

        scanner.close();
    }

    public static String[][] findCharacterFrequencies(String str) {
        char[] chars = str.toCharArray();
        int[] charFrequencies = new int[chars.length];

        // Initialize frequencies to 1
        for (int i = 0; i < chars.length; i++) {
            charFrequencies[i] = 1;
        }

        // Find and mark duplicate characters
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { // Check if character is not already marked as duplicate
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        charFrequencies[i]++;
                        chars[j] = '0'; // Mark duplicate character
                    }
                }
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[chars.length][2];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { // Include only non-duplicate characters
                result[index][0] = String.valueOf(chars[i]);
                result[index][1] = String.valueOf(charFrequencies[i]);
                index++;
            }
        }

        // Resize the result array to the actual number of unique characters
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }

        return finalResult;
    }

    public static void displayCharacterFrequencies(String[][] charFrequencies) {
        System.out.println("Character\tFrequency");
        for (String[] charFrequency : charFrequencies) {
            if (charFrequency[0] != null) {
                System.out.println(charFrequency[0] + "\t\t" + charFrequency[1]);
            }
        }
    }
}