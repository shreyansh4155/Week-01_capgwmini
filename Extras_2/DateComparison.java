import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input dates from the user
        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String date1Str = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(date1Str);

        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String date2Str = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(date2Str);

        // Compare dates
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else {
            System.out.println(date1 + " is the same as " + date2);
        }
    }
}