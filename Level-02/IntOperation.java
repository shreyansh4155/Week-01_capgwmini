import java.util.Scanner;

public class IntOperation {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scn.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scn.nextInt();

        System.out.print("Enter the value of c: ");
        int c = scn.nextInt();

        // Performing integer operations
        int result1 = a + b * c; 
        int result2 = a * b + c;        
        int result3 = c + a / b;              
        int result4 = a % b + c; 
        // Printing the results
        System.out.println("The results of Int Operations are: ");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

       
    }
}

