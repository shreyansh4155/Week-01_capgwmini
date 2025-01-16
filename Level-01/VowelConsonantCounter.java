import java.util.*;
class VowelConsonantCounter {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scn.nextLine();
        int vowel = 0;
        int consonant = 0;
         
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' ||
                str.charAt(i) == 'e' ||
                str.charAt(i) == 'i' ||
                str.charAt(i) == 'o' ||
                str.charAt(i) == 'u' ){
            
                vowel++;
            }
            else{
                consonant++;
            }
        }
        
        System.out.println("Numbers of vowel: "+ vowel);
        System.out.println("Numbers of consonant: "+ consonant);
        
        
    }
}