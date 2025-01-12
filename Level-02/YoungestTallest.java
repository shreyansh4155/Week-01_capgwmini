import java.util.Scanner;

public class YoungestTallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get ages
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();

        // Get heights
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = scanner.nextDouble();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = scanner.nextDouble();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = scanner.nextDouble();

        scanner.close();

        // Find youngest
        int youngestAge = Math.min(Math.min(amarAge, akbarAge), anthonyAge);

        // Find tallest
        double tallestHeight = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);

        // Determine youngest friend
        String youngestFriend;
        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Determine tallest friend
        String tallestFriend;
        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        System.out.println("Youngest friend: " + youngestFriend);
        System.out.println("Tallest friend: " + tallestFriend);
    }
}