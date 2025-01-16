import java.util.Scanner;

public class ArrayExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[numNames];

        for (int i = 0; i < numNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        generateException(names);
        handleException(names);
    }

    public static void generateException(String[] names) {
        try {
            System.out.println("Accessing an invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + ex.getMessage());
        }
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing an invalid index (again): " + names[names.length]);
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException caught: " + ex.getMessage());
        }
    }
}