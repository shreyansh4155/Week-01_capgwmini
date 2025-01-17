import java.util.Scanner;

public class RemoveSpecificCharacter {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scn.nextLine();
        System.out.println("Enter the character");
        char ch =scn.next().charAt(0);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ch){
                sb.append(str.charAt(i));
            }
        }
        sb.toString();

        System.out.println("Removed string is: " + sb);
    }
}