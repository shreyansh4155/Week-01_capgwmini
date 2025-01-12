import java.util.Scanner;

public class TrigonometricFunctions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angleInDegrees = scanner.nextDouble();

        double[] results = calculateTrigonometricFunctions(angleInDegrees);

        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        scanner.close();
    }

    public static double[] calculateTrigonometricFunctions(double angleInDegrees) {
        // Converting the  degrees to radians
        double angleInRadians = Math.toRadians(angleInDegrees);

               double sin = Math.sin(angleInRadians);
        double cos = Math.cos(angleInRadians);
        double tan = Math.tan(angleInRadians);

        
        double[] results = {sin, cos, tan};

        return results;
    }
}