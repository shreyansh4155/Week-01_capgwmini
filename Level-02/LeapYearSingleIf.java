import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check leap year using a single if condition
        if (year >= 1582 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println("Year is not a Leap Year or is less than 1582.");
        }
         scanner.close();
    }
}