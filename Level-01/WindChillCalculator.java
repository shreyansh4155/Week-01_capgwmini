import java.util.Scanner;

public class WindChillCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);

        System.out.println("The wind chill temperature is: " + windChill);

        scanner.close();
    }

    public static double calculateWindChill(double temperature, double windSpeed) {
        if (temperature <= 50 && windSpeed >= 3) {
            double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
            return windChill;
        } else {
            System.out.println("Wind chill calculation is not valid for these conditions.");
            return Double.NaN; // Return NaN (Not a Number) for invalid conditions
        }
    }
}