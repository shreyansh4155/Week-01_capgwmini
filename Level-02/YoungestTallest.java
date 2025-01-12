import java.util.Scanner;

public class YoungestTallest {

    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);

        // Declare arrays to store ages and heights
        int ages = new int[3];
        double heights = new double[3];

        // Get input for ages
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for friend " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Get input for heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter height (in meters) for friend " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the results
        System.out.println("Youngest friend: Friend " + (youngestIndex + 1));
        System.out.println("Tallest friend: Friend " + (tallestIndex + 1));

        scanner.close();
    }
}