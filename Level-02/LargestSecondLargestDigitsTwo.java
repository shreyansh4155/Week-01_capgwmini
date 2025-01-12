import java.util.Scanner;

public class LargestSecondLargestDigitsTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int maxDigit = 1; 
        int[] digits = new int[maxDigit]; 
        int temp = num;
        int index = 0;

        while (temp > 0) {
            if (index == maxDigit) { 
                // Increase array size if index reaches maxDigit
                maxDigit += 10; 
                int[] tempDigits = new int[maxDigit]; 
                System.arraycopy(digits, 0, tempDigits, 0, index); 
                digits = tempDigits; 
            }
            digits[index++] = temp % 10;
            temp /= 10;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}