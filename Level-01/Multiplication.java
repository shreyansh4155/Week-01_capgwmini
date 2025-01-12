import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number in between 6 to 9: ");
        int number = scanner.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(number + " * " + i + " = " + (number*i));
        }

        
    }
}

