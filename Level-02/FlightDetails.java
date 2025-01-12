import java.util.Scanner;

public class FlightDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter passenger name: ");
        String name = scanner.nextLine();

        System.out.print("Enter from city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter to city: ");
        String toCity = scanner.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToViaDistance = scanner.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCityDistance = scanner.nextDouble();

        System.out.print("Enter time taken for the journey (in hours): ");
        double journeyTime = scanner.nextDouble();

        // Calculate total distance
        double totalDistance = fromToViaDistance + viaToFinalCityDistance;

        // Calculate average speed
        double averageSpeed = totalDistance / journeyTime;

        // Calculate cost (assuming a base cost per mile)
        double baseCostPerMile = 0.5; // Example base cost
        double totalCost = totalDistance * baseCostPerMile;

        // Get discount percentage from user
        System.out.print("Enter discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        // Calculate discount amount
        double discountAmount = (discountPercentage / 100) * totalCost;

        // Calculate final cost after discount
        double finalCost = totalCost - discountAmount;

        // Print results
        System.out.println("\nFlight Details for " + name);
        System.out.println("From: " + fromCity);
        System.out.println("Via: " + viaCity);
        System.out.println("To: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Average Speed: " + averageSpeed + " miles/hour");
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Final Cost: $" + finalCost);

        scanner.close();
    }
}

