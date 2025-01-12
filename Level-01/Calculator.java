import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
        System.out.print("Enter the first number: ");
        float number1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float number2 = scanner.nextFloat();

        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;

        // Check for division by zero
        float division = number2 != 0 ? number1 / number2 : Float.NaN; 

        System.out.println("The addition, subtraction, multiplication and division value of " 
                + number1 + " and " + number2 + " is " 
                + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        scanner.close();
    }
}