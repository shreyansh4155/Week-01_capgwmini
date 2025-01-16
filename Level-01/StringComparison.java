import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scn.next();

        System.out.print("Enter the second string: ");
        String str2 = scn.next();

        boolean result1 = compareStrings(str1, str2);
        boolean result2 = str1.equals(str2);

        System.out.println("Comparison using charAt(): " + result1);
        System.out.println("Comparison using equals(): " + result2);

        
    }

    public static boolean compareStrings(String str1, String str2) {
        

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}