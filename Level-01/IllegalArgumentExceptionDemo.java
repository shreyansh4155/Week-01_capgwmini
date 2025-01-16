import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        generateException(str);
        handleException(str);
    }

    public static void generateException(String str) {
        try {

            String subStr = str.substring(5, 2);
            System.out.println("Substring: " + subStr);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }

    public static void handleException(String str) {
        try {

            String subStr = str.substring(5, 2);
            System.out.println("Substring: " + subStr);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}