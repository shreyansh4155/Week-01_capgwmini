import java.util.Scanner;

public class OddEvenUsingForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        for(int i=0;i<=number;i++){
            if(i % 2 == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("odd");
            }
        }

    }
}