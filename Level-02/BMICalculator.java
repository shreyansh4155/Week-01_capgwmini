import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in centimeters: ");
        double height = scanner.nextDouble();

        scanner.close();

        // Convert height from centimeters to meters
        height /= 100;

        // Calculate BMI
        double bmi = weight / (height * height);

        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Determine weight status
        String weightStatus;
        if (bmi < 18.5) {
            weightStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            weightStatus = "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }

        System.out.println("Your weight status: " + weightStatus);
    }
}