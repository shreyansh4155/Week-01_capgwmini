import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        int result = compareStrings(str1, str2);

        if (result < 0) {
            System.out.println(str1 + " comes before " + str2 + " lexicographically.");
        } else if (result > 0) {
            System.out.println(str2 + " comes before " + str1 + " lexicographically.");
        } else {
            System.out.println(str1 + " and " + str2 + " are lexicographically equal.");
        }

        scanner.close();
    }

    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = Math.min(len1, len2);

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                return -1; // str1 comes before str2
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return 1; // str2 comes before str1
            }
        }

        // If all characters are equal up to the length of the shorter string
        if (len1 == len2) {
            return 0; // Strings are equal
        } else if (len1 < len2) {
            return -1; // str1 comes before str2 (shorter string comes first)
        } else {
            return 1; // str2 comes before str1 (longer string comes later)
        }
    }
}