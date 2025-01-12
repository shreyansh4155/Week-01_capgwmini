import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the years of service: ");
        int yearOfService = scanner.nextInt();

        double bonus = 0.0;

        if (yearsOfService > 5) {
            bonus = salary * 0.05; // Calculate 5% of salary
        }

        System.out.println("Bonus amount: " + bonus);

        
    }
}