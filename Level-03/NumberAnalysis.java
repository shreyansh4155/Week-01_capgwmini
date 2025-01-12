import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            return 1;       
 } else if (num1 < num2) {
            return -1; 
        } else {
            return 0;         }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Get the iser input        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Analyzing each number
        for (int i = 0; i < 5; i++) {
            int number = numbers[i];

            if (isPositive(number)) {
                System.out.print(number + " is positive ");
                if (isEven(number)) {
                    System.out.println("and even.");
                } else {
                    System.out.println("and odd.");
                }
            } else {
                System.out.println(number + " is negative.");
            }
        }

                int comparisonResult = compareNumbers(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (comparisonResult == -1) {
            System.out.println("First number is less than the last number.");
        } else {
            System.out.println("First number is equal to the last number.");
        }

        scanner.close();
    }
}