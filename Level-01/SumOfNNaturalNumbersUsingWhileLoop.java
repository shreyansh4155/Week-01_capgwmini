import java.util.Scanner;

public class SumOfNNaturalNumbersUsingWhileLoop {

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

        // Calculate sum using while loop
        int sumLoop = 0;
        int i = 1;
        while (i <= n) {
            sumLoop += i;
            i++;
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