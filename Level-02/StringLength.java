import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();

        int customLength = stringLength(str);
        int actualLength = str.length();

        System.out.println("String Length (Custom): " + customLength);
        System.out.println("String Length (Built-in): " + actualLength);
    }

    public static int stringLength(String str) {
        int count = 0;
        int i = 0;

        while (true) {
            try {
                char c = str.charAt(i);
                count++;
                i++;
            } catch (StringIndexOutOfBoundsException e) {
                break; // Exit the loop when index is out of bounds
            }
        }

        return count;
    }
}