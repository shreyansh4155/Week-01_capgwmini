import java.util.Scanner;

public class ArmstrongNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // 1. Store the original number for comparison
        int originalNumber = number; 

        // 2. Initialize sum to 0
        int sum = 0;

        // 3. Extract digits and calculate sum of cubes
        while (number > 0) {
            // 4. Extract the last digit
            int remainder = number % 10; 

            // 5. Calculate the cube of the last digit
            sum += Math.pow(remainder, 3); 

            // 6. Remove the last digit from the number
            number /= 10; 
        }

        // 7. Check if the number is Armstrong
        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}