import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args){


    //taking input 

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of children: ");
        int noOfChildren = scn.nextInt();
    
        System.out.println("Enter the number of chocolate: ");
        int noOfChocolate = scn.nextInt();
    
        //calculating the no. of chocolate divided
        int dividedChocolate = noOfChocolate / noOfChildren;
    
        //calculating the no of chocolate remained
        int remainingChocolate = noOfChocolate % noOfChildren;
    
        System.out.println("The number of chocolates each child gets is " +dividedChocolate+"and the number of remaining chocolates are" +remainingChocolate);
    
    }
}