import java.util.Scanner;

public class PoundToKilogram {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scn.nextDouble();

        // conversion of pounds to kilograms
        double weightInKilograms = weightInPounds / 2.20462; 

        // Displaying the result
        System.out.println("The weight of the person in pounds is " + weightInPounds);
        System.out.println("The weight of the person in kg is " + weightInKilograms);

        scanner.close();
    }
}

