import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Calculate distance in yards
        double distanceInYards = distanceInFeet / 3;

        // Calculate distance in miles
        double distanceInMiles = distanceInFeet / 5280; 

        System.out.println("Distance in yards: " + distanceInYards);
        System.out.println("Distance in miles: " + distanceInMiles);

        scanner.close();
    }
}