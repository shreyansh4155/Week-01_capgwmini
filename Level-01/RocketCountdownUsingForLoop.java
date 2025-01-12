import java.util.Scanner;

public class RocketCountdownUsingForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting countdown value: ");
        int startValue = scanner.nextInt();

        for (int i = startValue; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Launch!");

        scanner.close();
    }
}