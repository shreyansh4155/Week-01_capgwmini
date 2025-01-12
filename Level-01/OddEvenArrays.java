import java.util.Scanner;

public class OddEvenArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
            scanner.close();
            return;
        }

        // Calculate the maximum possible size for even and odd arrays
        int maxEvenSize = number / 2 + 1; // Add 1 to handle cases where number is odd
        int maxOddSize = number / 2 + 1;

        // Create arrays to store even and odd numbers
        int[] evenNumbers = new int[maxEvenSize];
        int[] oddNumbers = new int[maxOddSize];

        // Initialize indexes for even and odd arrays
        int evenIndex = 0;
        int oddIndex = 0;

        // Iterate from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // If even, store in the even array
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                // If odd, store in the odd array
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print the even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Print the odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}