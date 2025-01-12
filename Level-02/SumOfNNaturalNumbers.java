import java.util.Scanner;

public class SumOfNNaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
            return;
        }

        int recursiveSum = sumOfNRecursive(n);
        int formulaSum = sumOfNFormula(n);

        System.out.println("Sum of " + n + " natural numbers (recursive): " + recursiveSum);
        System.out.println("Sum of " + n + " natural numbers (formula): " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("Results from both methods do not match.");
        }

        scanner.close();
    }

    public static int sumOfNRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOfNRecursive(n - 1);
        }
    }

    public static int sumOfNFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}