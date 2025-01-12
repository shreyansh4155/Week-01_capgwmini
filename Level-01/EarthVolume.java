import java.lang.*;

public class EarthVolume {

    public static void main(String[] args) {
        double earthRadiusKm = 6378.0; // Radius of Earth in kilometers
        double earthRadiusMiles = earthRadiusKm * 0.621371; // Radius of Earth in miles

        // Calculate volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusKm, 3);

        // Calculate volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3);
        System.out.println("The volume of earth in cubic miles is " + volumeMiles3);
    }
}