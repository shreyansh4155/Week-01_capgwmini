import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double height) {
        // height from cm to meters
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];
        // Getting weight and height        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for member " + (i + 1) + ":");
            data[i][0] = scanner.nextDouble();
            System.out.println("Enter height (cm) for member " + (i + 1) + ":");
            data[i][1] = scanner.nextDouble();

            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        
        String[] bmiStatus = new String[10];
        for (int i = 0; i < 10; i++) {
            bmiStatus[i] = determineBMIStatus(data[i][2]);
        }

        // Display results
        System.out.println("\nMember\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n", 
                    i + 1, data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }

        scanner.close();
    }
}