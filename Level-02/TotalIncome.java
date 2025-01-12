import java.util.Scanner;

public class TotalIncome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the salary (INR): ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the bonus (INR): ");
        double bonus = scanner.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
                           ". Hence Total Income is INR " + totalIncome);

        scanner.close();
    }
}
