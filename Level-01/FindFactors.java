import java.util.Scanner;

public class FindFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initial capacity for factors array
        int maxFactors = 10; 
        int[] factors = new int[maxFactors];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If the array is full, resize it
                if (index == maxFactors) {
                    maxFactors *= 2; // Double the capacity
                    int[] temp = new int[maxFactors];
                    System.arraycopy(factors, 0, temp, 0, index);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        // Print the factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}