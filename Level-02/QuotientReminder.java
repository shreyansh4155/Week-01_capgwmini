import java.util.Scanner;

public class QuotientReminder {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scn.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scn.nextInt();

        // Calculating quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + 
                           " of two number " + number1 + " and " + number2);

       
    }
}

