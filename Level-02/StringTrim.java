import java.util.Scanner;

public class StringTrim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        int[] startEnd = trimLeadingTrailingSpaces(str);
        String trimmedStr1 = createSubstring(str, startEnd[0], startEnd[1]);
        String trimmedStr2 = str.trim();

        boolean result = compareStrings(trimmedStr1, trimmedStr2);

        System.out.println("Trimmed string (user-defined): " + trimmedStr1);
        System.out.println("Trimmed string (trim()): " + trimmedStr2);

        if (result) {
            System.out.println("Both trimmed strings are identical.");
        } else {
            System.out.println("Trimmed strings are not identical.");
        }

        scanner.close();
    }

    public static int[] trimLeadingTrailingSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start < str.length() && Character.isWhitespace(str.charAt(start))) {
            start++;
        }

        // Trim trailing spaces
        while (end >= 0 && Character.isWhitespace(str.charAt(end))) {
            end--;
        }

        int[] result = {start, end};
        return result;
    }

    public static String createSubstring(String str, int start, int end) {
        if (start < 0 || end >= str.length() || start > end) {
            return ""; // Handle invalid indices
        }

        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}