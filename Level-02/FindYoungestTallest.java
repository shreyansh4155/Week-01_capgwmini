import java.util.Scanner;

public class FindYoungestTallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get ages of friends
        int[] ages = new int[3];
        System.out.println("Enter ages of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            ages[i] = scanner.nextInt();
        }

        // Get heights of friends
        double[] heights = new double[3];
        System.out.println("Enter heights of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            heights[i] = scanner.nextDouble();
        }

        String youngest = findYoungest(ages);
        String tallest = findTallest(heights);

        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);

        scanner.close();
    }

    public static String findYoungest(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        String[] friends = {"Amar", "Akbar", "Anthony"};
        return friends[youngestIndex];
    }

    public static String findTallest(double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        String[] friends = {"Amar", "Akbar", "Anthony"};
        return friends[tallestIndex];
    }
}