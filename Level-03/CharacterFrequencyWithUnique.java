import java.util.Scanner;

public class CharacterFrequencyWithUnique {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(str);
        String[][] charFrequencies = findCharacterFrequencies(str, uniqueChars);

        displayCharacterFrequencies(charFrequencies);

        scanner.close();
    }

    public static char[] findUniqueCharacters(String str) {
        int length = str.length();
        char[] uniqueChars = new char[length]; 
        int uniqueCharCount = 0; 

        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            char c = str.charAt(i);

            for (int j = 0; j < i; j++) {
                if (c == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCharCount++] = c;
            }
        }

        // Create a new array with the actual number of unique characters
        char[] result = new char[uniqueCharCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCharCount); 

        return result;
    }

    public static String[][] findCharacterFrequencies(String str, char[] uniqueChars) {
        int[] charCounts = new int[256]; 

        // Calculate character frequencies
        for (int i = 0; i < str.length(); i++) {
            charCounts[str.charAt(i)]++;
        }

        String[][] charFrequencies = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            charFrequencies[i][0] = String.valueOf(uniqueChars[i]);
            charFrequencies[i][1] = String.valueOf(charCounts[uniqueChars[i]]); 
        }

        return charFrequencies;
    }

    public static void displayCharacterFrequencies(String[][] charFrequencies) {
        System.out.println("Character\tFrequency");
        for (String[] charFrequency : charFrequencies) {
            System.out.println(charFrequency[0] + "\t\t" + charFrequency[1]);
        }
    }
}