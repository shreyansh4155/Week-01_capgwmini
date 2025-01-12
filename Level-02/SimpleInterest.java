import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args){

   //taking input

    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the Principal amount: ");
    double principal = scn.nextDouble();
    
    System.out.println("Enter the Rate: ");
    double rate = scn.nextDouble();
    
    System.out.println("Enter the Time: ");
    double time = scn.nextDouble();

    //calculating the simple interest
    
    double simpleInterest = (principal * rate * time) /100;
    System.out.println(" The Simple Interest is "+simpleInterest +"for Principal "+
                                                    principal +"for rate"+
                                                    rate +"and for time "+
                                                    time);
    }
}

