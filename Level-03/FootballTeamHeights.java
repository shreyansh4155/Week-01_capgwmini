import java.util.Random;

public class FootballTeamHeights {

    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double calculateMeanHeight(int[] heights) {
        return (double) sumOfHeights(heights) / heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }

    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();

        // Generate random heights for 11 players
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // Random height between 150cm and 250cm
        }

        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);
        double meanHeight = calculateMeanHeight(heights);

        System.out.println("Shortest height: " + shortestHeight + " cm");
        System.out.println("Tallest height: " + tallestHeight + " cm");
        System.out.println("Mean height: " + String.format("%.2f", meanHeight) + " cm");
    }
}