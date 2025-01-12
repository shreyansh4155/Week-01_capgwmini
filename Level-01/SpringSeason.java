import java.util.*;
public class SpringSeason {

    public static void main(String[] args) {
        
        //taking input from the user in command line args

        int month = Integer.parseInt(args[0]);//cmd args
        int day = Integer.parseInt(args[1]);

 	//calling the function to check

        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20) { 
            return true;
        } else if (month == 4) { 
            return true;
        } else if (month == 5) { 
            return true;
        } else if (month == 6 && day <= 20) { 
            return true;
        } else {
            return false;
        }
    }
}
