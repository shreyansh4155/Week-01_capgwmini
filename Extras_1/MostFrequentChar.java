import java.util.Scanner;

public class MostFrequentChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Assuming ASCII characters

        int[] charCount = new int[256];

        // Counting the frequency of each character

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        char mostFrequentChar = ' ';
        int maxCount = 0;

        // Find the character with the maximum count


        for (int i = 0; i < 256; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                mostFrequentChar = (char) i;
            }
        }

        System.out.println("The most frequent character is: " + mostFrequentChar);
    }
}