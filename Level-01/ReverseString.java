
import java.util.*;
class ReverseString {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scn.nextLine();
        String reverseStr = "";
        
        for(int i=str.length()-1; i>=0 ;i--){
            reverseStr += str.charAt(i);
        }
        
        
        
        System.out.println("Reverse String is: "+ reverseStr);

        
    }
}