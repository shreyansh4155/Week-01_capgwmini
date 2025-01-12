import java.util.Scanner;

public class RocketCountdown {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting countdown value: ");
        int counter = scanner.nextInt();

	//decreasing the number cor countdown

        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Launch!");


    }
}