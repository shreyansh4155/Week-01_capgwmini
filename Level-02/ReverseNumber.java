import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = extractDigits(number);

        System.out.print("Reversed digits: ");
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i] + " ");
        }
    }

    private static int[] extractDigits(int num) {
        int temp = num;
        int count = 0;

        // Count the number of digits
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        temp = num;
        int index = 0;

        // Extract digits and store in array
        while (temp > 0) {
            digits[index++] = temp % 10;
            temp /= 10;
        }

        return digits;
    }
}