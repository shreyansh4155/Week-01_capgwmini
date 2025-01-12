import java.util.*;
class SimpleInterest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the principal");
        int principal = scn.nextInt();
        System.out.println("Enter the rate");
        int rate = scn.nextInt();
        System.out.println("Enter the time");
        int time = scn.nextInt();
        
        
        System.out.println("The Simple Interest is"+simpleInterest(principal,rate,time) +" for Principal "+ principal+" Rate of Interest " + "  and Time " + time);
    }
    
    
    public static int simpleInterest(int principal,int rate,int time){
        int simpInt = principal * rate * time;
        return simpInt;
    }
}