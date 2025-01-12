
import java.util.Scanner;

public class FizzBuzzUsingWhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1;
            while (i <= n) {
                if(i % 3 == 0)
                    System.out.println("Fizz");
                
                if(i % 5 == 0)
                    System.out.println("Buzz");
                
                if(i % 3 == 0 && n % 5 == 0)
                    System.out.println("FizzBuzz");
                
                else{
                    System.out.println(i);
                }

                i++;
            }
        }
    }
}