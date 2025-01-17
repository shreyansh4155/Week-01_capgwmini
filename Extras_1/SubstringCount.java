import java.util.Scanner;

public class SubstringCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String sub = scanner.nextLine();

        int count = countOccurrences(str, sub);

        System.out.println("The substring '" + sub + "' occurs " + count + " times in the string.");

        scanner.close();
    }

    public static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        return count;
    }
}