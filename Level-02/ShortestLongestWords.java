import java.util.Scanner;

public class ShortestLongestWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String[][] wordLengths = getWordLengths(text);
        int[] shortestLongest = findShortestLongest(wordLengths);

        System.out.println("Shortest word: " + wordLengths[shortestLongest[0]][0]);
        System.out.println("Longest word: " + wordLengths[shortestLongest[1]][0]);

        scanner.close();
    }

    public static String[][] getWordLengths(String text) {
        String[] words = splitText(text);
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(stringLength(words[i]));
        }

        return wordLengths;
    }

    public static String[] splitText(String text) {
        int wordCount = countWords(text);
        int[] spaceIndices = findSpaceIndices(text, wordCount);
        String[] words = new String[wordCount];

        int startIndex = 0;
        for (int i = 0; i < wordCount; i++) {
            int endIndex = (i == wordCount - 1) ? text.length() : spaceIndices[i];
            words[i] = text.substring(startIndex, endIndex);
            startIndex = endIndex + 1; // Move to the next word
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

    public static int[] findSpaceIndices(String text, int wordCount) {
        int[] spaceIndices = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndices[index++] = i;
            }
        }
        return spaceIndices;
    }

    public static int stringLength(String str) {
        int count = 0;
        try {
            while (true) {
                char c = str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Do nothing, exception is expected
        }
        return count;
    }

    public static int[] findShortestLongest(String[][] wordLengths) {
        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLength = Integer.parseInt(wordLengths[0][1]);
        int longestLength = Integer.parseInt(wordLengths[0][1]);

        for (int i = 1; i < wordLengths.length; i++) {
            int currentLength = Integer.parseInt(wordLengths[i][1]);
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        int[] result = {shortestIndex, longestIndex};
        return result;
    }
}