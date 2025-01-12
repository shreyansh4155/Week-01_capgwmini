// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class FizzBuzzUsingForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for(int i=1;i<=number;i++){
            if(i % 3 == 0)
                System.out.println("Fizz");
                
            if(i % 5 == 0)
                System.out.println("Buzz");
                
            if(i % 3 == 0 && number % 5 == 0)
                System.out.println("FizzBuzz");
                
            else{
                System.out.println(i);
            }
            
        }
    }
}