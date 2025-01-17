import java.util.Scanner;

public class RemoveDuplicates {

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String modifiedStr = removeDuplicates(str);
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + modifiedStr);

        scanner.close();
    }
}