import java.util.Scanner;

public class TextToLowerCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        String text = scanner.nextLine();

        String lowerCaseText = convertToUpperCase(text);
        System.out.println("String converted to upperCase: " +lowerCaseText);
        String expectedUppercase = text.toLowerCase();
        boolean isEqual = compareString(lowerCaseText ,expectedUppercase);
        System.out.println("All the character are same:  " + isEqual);

    }
    public static String convertToUpperCase(String text){
        StringBuilder sb =new StringBuilder();
        for (int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(Character.isUpperCase(ch)){
                ch = (char)(ch + 32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
    public static boolean compareString(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
