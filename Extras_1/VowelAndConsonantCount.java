import java.util.Scanner;

public class VowelAndConsonantCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string you want to count vowel and consonant: ");
        String str = scn.nextLine();
        int i=0;
        int vowel=0;
        int consonant =0;

        while(i<str.length()){
            if(str.charAt(i) == 'a'||
                    str.charAt(i) == 'e'||
            str.charAt(i) == 'i' ||
            str.charAt(i) == 'o'||
            str.charAt(i) == 'u'){
                vowel++;
            }else {
                consonant++;
            }
            i++;
        }
        System.out.println("The number of vowel "+vowel+" and consonant " + consonant);
    }
}
