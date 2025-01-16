import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPersons = 10; // Number of persons in the team
        double[][] personData = new double[numPersons][2]; // 2D array to store weight and height

        // Get weight and height for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            personData[i][0] = scanner.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ":");
            personData[i][1] = scanner.nextDouble();
        }

        String[][] bmiData = calculateBMIandStatus(personData);

        displayBMIData(bmiData);

        scanner.close();
    }

    public static String[][] calculateBMIandStatus(double[][] personData) {
        String[][] bmiData = new String[personData.length][4]; // 4 columns: Height, Weight, BMI, Status
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double height = personData[i][1] / 100.0; // Convert cm to meters
            double bmi = weight / (height * height);

            bmiData[i][0] = String.format("%.2f", personData[i][1]); // Height in cm (2 decimal places)
            bmiData[i][1] = String.format("%.2f", weight); // Weight in kg (2 decimal places)
            bmiData[i][2] = String.format("%.2f", bmi); // BMI (2 decimal places)

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                status = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            bmiData[i][3] = status;
        }
        return bmiData;
    }

    public static void displayBMIData(String[][] bmiData) {
        System.out.println("Height (cm)\tWeight (kg)\tBMI\t\tStatus");
        for (String[] person : bmiData) {
            System.out.println(person[0] + "\t\t" + person[1] + "\t\t" + person[2] + "\t\t" + person[3]);
        }
    }
}