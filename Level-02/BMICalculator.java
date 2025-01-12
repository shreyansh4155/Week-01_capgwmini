import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            weights[i] = scanner.nextDouble();
            System.out.println("Enter height (meters) for person " + (i + 1) + ":");
            heights[i] = scanner.nextDouble();

            // Calculate BMI
            bmis[i] = calculateBMI(weights[i], heights[i]);

            // Determine weight status
            statuses[i] = determineWeightStatus(bmis[i]);
        }

        // Display results
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", heights[i], weights[i], bmis[i], statuses[i]);
        }
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String determineWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}