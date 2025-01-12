import java.util.Scanner;

public class SumOfNNaturalNumbersForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }

        // Calculate sum using formula
        int sumFormula = (n * (n + 1)) / 2;

        // Calculate sum using for loop
        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i; 
        }

        // Compare results
        if (sumFormula == sumLoop) {
            System.out.println("Both methods produce the same result.");
            System.out.println("Sum of " + n + " natural numbers is: " + sumFormula); 
        } else {
            System.out.println("Results from both methods do not match.");
        }

        scanner.close();
    }
}