import java.util.Scanner;

public class PalindromeStringChecker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse: ");
        String str = scn.nextLine();
        int start=0;
        int end =str.length()-1;
        boolean isPalind = false;

        while(start < end){
            if(str.charAt(start) == str.charAt(end)){
                isPalind = true;
            }else {
                isPalind = false;
            }
            start++;
            end--;
        }
        System.out.println(isPalind);

    }
}
