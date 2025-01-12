import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            boolean validInput;

            do {
                System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
                physicsMarks[i] = scanner.nextInt();
                validInput = (physicsMarks[i] >= 0 && physicsMarks[i] <= 100);
                if (!validInput) {
                    System.out.println("Invalid input. Marks must be between 0 and 100.");
                }
            } while (!validInput);

            do {
                System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
                chemistryMarks[i] = scanner.nextInt();
                validInput = (chemistryMarks[i] >= 0 && chemistryMarks[i] <= 100);
                if (!validInput) {
                    System.out.println("Invalid input. Marks must be between 0 and 100.");
                }
            } while (!validInput);

            do {
                System.out.print("Enter Maths marks for student " + (i + 1) + ": ");
                mathMarks[i] = scanner.nextInt();
                validInput = (mathMarks[i] >= 0 && mathMarks[i] <= 100);
                if (!validInput) {
                    System.out.println("Invalid input. Marks must be between 0 and 100.");
                }
            } while (!validInput);

            int totalMarks = physicsMarks[i] + chemistryMarks[i] + mathMarks[i];
            percentages[i] = (double) totalMarks / 300 * 100;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t\t%.2f\t\t%c\n", 
                    i + 1, physicsMarks[i], chemistryMarks[i], mathMarks[i], percentages[i], grades[i]);
        }

        scanner.close();
    }
}