import java.util.Scanner;

public class ArrayInputSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10]; // Array to store numbers
        double sum = 0.0; // Variable to store the sum
        int index = 0; // Index for the array

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = scanner.nextDouble();

            // Check for termination conditions
            if (num <= 0 || index >= 10) {
                break;
            }

            // Store the number in the array
            numbers[index] = num;

            // Add the number to the sum
            sum += num;

            index++;
        }

        // Print the entered numbers
        System.out.print("Entered numbers: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Print the sum of the numbers
        System.out.println("Sum of numbers: " + sum);

        scanner.close();
    }
}