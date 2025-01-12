import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter marks for Maths: ");
        int maths = scanner.nextInt();

        // Calculate total marks, average, and percentage
        int totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0;

        // Display the average marks
        System.out.println("Average Marks: " + percentage);

        // Determine the grade based on percentage
        if (percentage >= 80) {
            System.out.println("Grade: A (Remarks:- Level-4, above agency-normalised standards.)");
        } else if (percentage >= 70 && percentage <=79) {
            System.out.println("Grade: B (Remarks:- Level-3, at agency-normalised standards.)");
        } else if (percentage >= 60 && percentage <=69) {
            System.out.println("Grade: C (Remarks:- Level-2, below but approaching agency-normalised standards.)");
        } else if (percentage >= 50 && percentage <=59) {
            System.out.println("Grade: D (Remarks:- Level-1, well below agency-normalised standards.)");
        } else if (percentage >= 40 && percentage <=49) {
            System.out.println("Grade: E (Remarks:- Level-(-1), too below agency-normalised standards.)");
        } else {
            System.out.println("Grade: R (Remarks:- Remedial standards)");
        }
         scanner.close();
    }
}