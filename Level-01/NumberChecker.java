import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //taking input from the user

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        //calling the checkNumber method

        int result = checkNumber(number);

        if (result == -1) {
            System.out.println("The number is negative.");
        } else if (result == 1) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    public static int checkNumber(int number) {
        if (number < 0) {
            return -1; // checking for Negative
        } else if (number > 0) {
            return 1; // checking for Negative
        } else {
            return 0; // checking for Zero
        }
    }
}