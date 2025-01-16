import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        int numStudents = 10; // Number of students
        int[] studentAges = generateRandomAges(numStudents);

        String[][] votingEligibility = checkVotingEligibility(studentAges);

        displayVotingEligibility(votingEligibility);
    }

    public static int[] generateRandomAges(int numStudents) {
        int[] ages = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            ages[i] = (int) (Math.random() * 90) + 10; // Generate random age between 10 and 99
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibilityData = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            eligibilityData[i][0] = Integer.toString(ages[i]); // Convert age to String

            if (ages[i] < 0) {
                eligibilityData[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                eligibilityData[i][1] = "Can Vote";
            } else {
                eligibilityData[i][1] = "Cannot Vote";
            }
        }

        return eligibilityData;
    }

    public static void displayVotingEligibility(String[][] eligibilityData) {
        System.out.println("Age\t\tEligibility");
        for (String[] data : eligibilityData) {
            System.out.println(data[0] + "\t\t" + data[1]);
        }
    }
}