import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse: ");
        String str = scn.nextLine();
        String revStr = "";
        int i = str.length()-1;
        while(i>=0){
            revStr += str.charAt(i);
            i--;
        }
        System.out.println("Reversed String "+revStr);
    }
}
