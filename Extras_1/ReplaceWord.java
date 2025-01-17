import java.util.Scanner;

public class ReplaceWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.next();

        System.out.print("Enter the replacement word: ");
        String newWord = scanner.next();

        String replacedSentence = replaceWord(sentence, oldWord, newWord);

        System.out.println("Replaced sentence: " + replacedSentence);

        scanner.close();
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll(oldWord, newWord);
    }
}