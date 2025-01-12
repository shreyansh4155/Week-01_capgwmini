public class Main {
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = UnitConvertor.convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");



	double celsius = UnitConvertor.convertCelsiusToFahrenheit(fahrenheit);
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");

	
	double celsius = UnitConvertor.convertPoundsToKilograms(fahrenheit);
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");


	double celsius = UnitConvertor.convertGallonsToLiters(fahrenheit);
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");


	double celsius = UnitConvertor.convertGallonsToLiters(fahrenheit);
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");

        }
}


public class UnitConvertor {

    // Temperature conversions
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Weight conversions
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Volume conversions
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

   }