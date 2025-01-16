import java.util.Scanner;

public class CustomNumberFormatException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        CustomNumberFormatException er = new CustomNumberFormatException();
        try {
            er.generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
        er.handleException(input);
    }

    public void generateException(String input) {
        int number = Integer.parseInt(input);
    }

    public void handleException(String input) {
        try {
            int number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}

