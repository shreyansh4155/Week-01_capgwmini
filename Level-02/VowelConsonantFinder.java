import java.util.Scanner;

public class VowelConsonantFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        String[][] characterTypes = findCharacterTypes(str);

        displayCharacterTypes(characterTypes);

        scanner.close();
    }

    public static String[][] findCharacterTypes(String str) {
        String[][] characterTypes = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            characterTypes[i][0] = String.valueOf(c); 
            characterTypes[i][1] = checkCharacter(c);
        }

        return characterTypes;
    }

    public static String checkCharacter(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        } else if (Character.isLetter(c)) { 
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static void displayCharacterTypes(String[][] characterTypes) {
        System.out.println("Character\tType");
        for (String[] characterType : characterTypes) {
            System.out.println(characterType[0] + "\t\t" + characterType[1]);
        }
    }
}