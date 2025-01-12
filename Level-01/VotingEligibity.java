import java.util.Scanner;

public class VotingEligibity {

    public static void main(String[] args) {
        int[] studentAges = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Get age input for each student
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();

            // Validate age input
            if (studentAges[i] < 0) {
                System.out.println("Invalid age for student " + (i + 1) + ".");
            }
        }

        // Check voting eligibility for each student
        for (int i = 0; i < studentAges.length; i++) {
            if (studentAges[i] < 0) {
                continue; // Skip students with invalid ages
            }

            if (studentAges[i] >= 18) {
                System.out.println("The student with the age " + studentAges[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + studentAges[i] + " cannot vote.");
            }
        }

        scanner.close();
    }
}