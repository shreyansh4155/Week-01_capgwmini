import java.util.Random;
import java.text.DecimalFormat;

public class StudentScores {

    public static int[][] generateRandomPCMScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 2D array: [student][subject]
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(101); // Physics
            scores[i][1] = rand.nextInt(101); // Chemistry
            scores[i][2] = rand.nextInt(101); // Maths
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // 2D array: [student][total, average, percentage]

        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            results[i][0] = total; // Total marks
            results[i][1] = (double) total / 3; // Average marks
            results[i][2] = (double) total / 300 * 100; // Percentage
        }

        // Round off average and percentage to 2 decimal places
        for (int i = 0; i < numStudents; i++) {
            results[i][1] = Math.round(results[i][1] * 100.0) / 100.0;
            results[i][2] = Math.round(results[i][2] * 100.0) / 100.0;
        }

        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        DecimalFormat df = new DecimalFormat("#.00"); // Format for 2 decimal places

        System.out.println("--------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + (i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t\t");
            }
            System.out.print((int) results[i][0] + "\t\t" + df.format(results[i][1]) + "\t\t" + df.format(results[i][2]) + "%");
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        int numStudents = 5; // Number of students
        int[][] scores = generateRandomPCMScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}