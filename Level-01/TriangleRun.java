import java.util.Scanner;

public class TriangleRun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //taking input for side1

        System.out.print("Enter the first side of the triangle (meters): ");
        double side1 = scanner.nextDouble();
        
        //taking input for side2

        System.out.print("Enter the second side of the triangle (meters): ");
        double side2 = scanner.nextDouble();
        
        //taking input for side3

        System.out.print("Enter the third side of the triangle (meters): ");
        double side3 = scanner.nextDouble();

        double targetDistance = 5000; // 5 km in meters

        double rounds = calculateRounds(side1, side2, side3, targetDistance);

        System.out.printf("The athlete needs to complete %.2f rounds of the park.\n", rounds); 
    }
    
    //creating another method for calculating rounds

    public static double calculateRounds(double side1, double side2, double side3, double targetDistance) {
        double perimeter = side1 + side2 + side3;
        return targetDistance / perimeter;
    }
}