import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        String[][] charFrequencies = findCharacterFrequencies(str);

        displayCharacterFrequencies(charFrequencies);

        scanner.close();
    }

    public static String[][] findCharacterFrequencies(String str) {
        int[] charCounts = new int[256]; // Array to store character frequencies

        // Calculate character frequencies
        for (int i = 0; i < str.length(); i++) {
            charCounts[str.charAt(i)]++;
        }

        // Create a 2D array to store characters and their frequencies
        String[][] charFrequencies = new String[str.length()][2]; 
        int index = 0; 

        for (int i = 0; i < 256; i++) {
            if (charCounts[i] > 0) {
                charFrequencies[index][0] = String.valueOf((char) i); 
                charFrequencies[index][1] = String.valueOf(charCounts[i]);
                index++;
            }
        }

        // Resize the array to the actual number of unique characters
        String[][] result = new String[index][2];
        for (int i = 0; i < index; i++) {
            result[i][0] = charFrequencies[i][0];
            result[i][1] = charFrequencies[i][1];
        }

        return result;
    }

    public static void displayCharacterFrequencies(String[][] charFrequencies) {
        System.out.println("Character\tFrequency");
        for (String[] charFrequency : charFrequencies) {
            if (charFrequency[0] != null) { // Print only characters with non-zero frequency
                System.out.println(charFrequency[0] + "\t\t" + charFrequency[1]);
            }
        }
    }
}