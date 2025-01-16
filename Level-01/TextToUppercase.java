import java.util.Scanner;

public class TextToUppercase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String uppercaseText = convertToUpperCase(text);
        System.out.println("Converted to Uppercase: " + uppercaseText);

        String expectedUppercase = text.toUpperCase();
        boolean isEqual = compareStrings(uppercaseText, expectedUppercase);

        System.out.println("All the character are same:  " + isEqual);
    }

    public static String convertToUpperCase(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = (char) (ch - 32); // Convert lowercase to uppercase
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}