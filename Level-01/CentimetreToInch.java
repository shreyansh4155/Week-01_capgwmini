import java.util.Scanner;

public class CentimetreToInch {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCentimeters = scanner.nextDouble();

        // Convert centimeters to inches
        double heightInches = heightCentimeters / 2.54;

        // Calculate feet and remaining inches
        int feet = (int) (heightInches / 12);
        double inches = heightInches % 12;

        // Print the results
        System.out.println("Your Height in cm is " + heightCentimeters 
                           + " while in feet is " + feet 
                           + " and inches is " + inches);

        // Close the scanner to release resources
        scanner.close();
    }
}

