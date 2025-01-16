

import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] studentScores = generateRandomScores(numStudents);
        double[][] studentResults = calculateResults(studentScores);
        String[][] studentGrades = calculateGrades(studentResults);

        displayScorecard(studentResults, studentGrades);

        scanner.close();
    }

    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Math
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 101); // Generate random score between 0 and 100
            }
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; // Total, Average, Percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / 3;
            double percentage = (double) total / 300 * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; 
        }

        return results;
    }

    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][1];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) {
                grades[i][0] = "A+";
            } else if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else {
                grades[i][0] = "F";
            }
        }

        return grades;
    }

    public static void displayScorecard(double[][] results, String[][] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\t\tTotal\t\tAverage\t\tPercentage\t\tGrade");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%.2f\t\t%.2f\t\t\t%s\n",
                    i + 1, 
                    scores[i][0], 
                    scores[i][1], 
                    scores[i][2], 
                    results[i][0], 
                    results[i][1], 
                    results[i][2], 
                    grades[i][0]);
        }
    }
}