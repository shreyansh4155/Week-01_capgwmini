import java.util.Scanner;

public class UniversityDiscount {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the course fee
        System.out.print("Enter the course fee: ");
        double fee = scanner.nextDouble(); 

        // Prompt the user to enter the discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = scanner.nextDouble(); 

        // Calculate the discount amount
        double discountAmount = (fee * discountPercent) / 100.0; 

        // Calculate the discounted price
        double discountedPrice = fee - discountAmount;

        // Print the results
        System.out.println("The discount amount is INR " + discountAmount);
        System.out.println("The final discounted fee is INR " + discountedPrice);

        // Close the scanner to release resources
        scanner.close(); 
    }
}

