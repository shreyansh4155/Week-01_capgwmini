import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scn.nextLine();
        String[] arrStr = str.split(" ");
        int arr[] = new int[arrStr.length];
        int max = 0;
        String longestWord = "";

        for (int i = 0; i < arrStr.length; i++) {
            arr[i] = arrStr[i].length();
            if (arr[i] > max) {
                max = arr[i];
                longestWord = arrStr[i];
            }
        }

        System.out.println("Longest word: " + longestWord);
    }
}