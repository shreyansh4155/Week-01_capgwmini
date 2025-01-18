import java.time.LocalDate;

public class DateArithematic {

    public static void main(String[] args) {
        // Input date (replace with your desired input method)
        LocalDate inputDate = LocalDate.of(2023, 11, 24); // Example date

        // Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = inputDate
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        // Subtract 3 weeks (21 days)
        LocalDate finalDate = modifiedDate.minusDays(21);

        // Display the result
        System.out.println("Input Date: " + inputDate);
        System.out.println("Modified Date (after additions): " + modifiedDate);
        System.out.println("Final Date (after subtraction): " + finalDate);
    }
}