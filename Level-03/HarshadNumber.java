import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sumOfDigits = 0;

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sumOfDigits += digit; 
            number /= 10; // Remove the last digit
        }

        if (originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        scanner.close();
    }
}