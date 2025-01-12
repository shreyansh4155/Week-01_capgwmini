import java.util.Scanner;

public class ZaraBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare arrays and variables
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Get employee data with input validation
        for (int i = 0; i < 10; i++) {
            boolean validInput = false;
            do {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                double salary = scanner.nextDouble();
                if (salary > 0) {
                    salaries[i] = salary;
                    validInput = true;
                } else {
                    System.out.println("Invalid salary. Please enter a positive value.");
                }
            } while (!validInput);

            validInput = false;
            do {
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                double years = scanner.nextDouble();
                if (years >= 0) {
                    yearsOfService[i] = years;
                    validInput = true;
                } else {
                    System.out.println("Invalid years of service. Please enter a non-negative value.");
                }
            } while (!validInput);

            totalOldSalary += salaries[i];
        }

        // Calculate bonuses and new salaries
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05; // 5% bonus
            } else {
                bonuses[i] = salaries[i] * 0.02; // 2% bonus
            }

            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        // Print results
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}