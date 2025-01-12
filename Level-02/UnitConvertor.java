public class UnitConvertor {

    public static final double KM_TO_MILES = 0.621371;
    public static final double MILES_TO_KM = 1.60934;
    public static final double METERS_TO_FEET = 3.28084;
    public static final double FEET_TO_METERS = 0.3048;

    // Converting kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    // Converting miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    // Converting meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    // Converting feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

  }





public class Main {
    public static void main(String[] args) {
        double km = 10; 
        double miles = UnitConvertor.convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");
    }
}
