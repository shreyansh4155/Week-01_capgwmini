import java.util.Scanner;

public class BMICalculator2DArray {

    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // 2D array to store weight, height, and BMI
        double personData = new double[numPersons][3]; 
        String weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            double weight, height;

            do {
                System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
                weight = scanner.nextDouble();
                if (weight < 0) {
                    System.out.println("Weight cannot be negative. Please enter a positive value.");
                }
            } while (weight < 0);

            do {
                System.out.println("Enter height (meters) for person " + (i + 1) + ":");
                height = scanner.nextDouble();
                if (height < 0) {
                    System.out.println("Height cannot be negative. Please enter a positive value.");
                }
            } while (height < 0);

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = calculateBMI(weight, height);
            weightStatus[i] = determineWeightStatus(personData[i][2]);
        }

        // Display results
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", 
                    personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
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

