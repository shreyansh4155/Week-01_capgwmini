import java.util.Scanner;

public class GreatestFactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int greatestFactor = 1;

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // Exit the loop once a factor is found
            }
        }

        System.out.println("Greatest factor of " + number + " (excluding itself): " + greatestFactor);
    }
}