import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;
        while(number > 0){
          //  int rem = number % 10;
            number = number / 10;
            count++;
        }
        System.out.println(count);
    }
}