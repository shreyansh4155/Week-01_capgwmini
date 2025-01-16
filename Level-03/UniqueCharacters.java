import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(str);

        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            if (c != '\0') { // Print only non-null characters
                System.out.print(c + " ");
            }
        }
        System.out.println();

        scanner.close();
    }

    public static char[] findUniqueCharacters(String str) {
        int length = stringLength(str);
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

    public static int stringLength(String str) {
        int count = 0;
        try {
            while (true) {
                char c = str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Do nothing, exception is expected
        }
        return count;
    }
}