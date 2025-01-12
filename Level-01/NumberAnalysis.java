import java.util.Scanner;

public class NumberAnalysis {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Analyze each number
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                System.out.print(numbers[i] + " is positive ");
                if (numbers[i] % 2 == 0) {
                    System.out.println("and even.");
                } else {
                    System.out.println("and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative.");
            } else {
                System.out.println(numbers[i] + " is zero.");
            }
        }

        // Compare first and last elements
        if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than the last element.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First element is less than the last element.");
        } else {
            System.out.println("First and last elements are equal.");
        }

        
    }
}