import java.util.Random;

public class ZaraBonus {

    public static int[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        int[][] employeeData = new int[numEmployees][2]; // [employee][salary, yearsOfService]
        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = rand.nextInt(90000) + 10000; // Salary between 10,000 and 99,999
            employeeData[i][1] = rand.nextInt(10) + 1; // Years of service between 1 and 10
        }
        return employeeData;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // [employee][salary, bonus, newSalary]
        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];

            double bonus;
            if (yearsOfService > 5) {
                bonus = salary * 0.05; // 5% bonus
            } else {
                bonus = salary * 0.02; // 2% bonus
            }

            double newSalary = salary + bonus;
            updatedData[i][0] = salary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }
        return updatedData;
    }

    public static void displayResults(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Employee\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("--------------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%.2f\t\t%.2f\n", 
                    i + 1, employeeData[i][0], employeeData[i][1], updatedData[i][1], updatedData[i][2]);
            totalOldSalary += employeeData[i][0];
            totalNewSalary += updatedData[i][2];
            totalBonus += updatedData[i][1];
        }

        System.out.println("--------------------------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
        System.out.println("--------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displayResults(employeeData, updatedData);
    }
}