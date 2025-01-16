import java.util.Scanner;

public class WordLengthAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String[] words = splitText(text);
        String[][] wordLengths = getWordLengths(words);

        System.out.println("Word\tLength");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t" + Integer.parseInt(wordLength[1]));
        }
    }

    public static String[] splitText(String text) {
        String[] words = new String[countWords(text)];
        int wordCount = 0;
        int start = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || i == text.length() - 1) {
                if (i == text.length() - 1) {
                    words[wordCount] = text.substring(start);
                } else {
                    words[wordCount] = text.substring(start, i);
                }
                wordCount++;
                start = i + 1;
            }
        }

        return words;
    }

    public static int countWords(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1; // Add 1 for the last word
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return wordLengths;
    }

    public static int getStringLength(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            count++;
        }
        return count;
    }
}