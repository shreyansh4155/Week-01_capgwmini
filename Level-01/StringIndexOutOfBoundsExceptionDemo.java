import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        generateException(str);
        handleException(str);
    }

    public static void generateException(String str) {
        try {
            // Accessing the last character correctly
            char ch = str.charAt(str.length() - 1);
            System.out.println("Character at index " + (str.length() - 1) + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    public static void handleException(String str) {
        try {
            // Accessing the last character correctly
            char ch = str.charAt(str.length() - 1);
            System.out.println("Character at index " + (str.length() - 1) + ": " + ch);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}