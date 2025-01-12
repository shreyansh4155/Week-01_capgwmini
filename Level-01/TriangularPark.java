import java.util.Scanner;

public class TriangularPark{
    public static void main(String[] args){

    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the side1: ");
    double side1 = scn.nextDouble();
    
    System.out.println("Enter the side2: ");
    double side2 = scn.nextDouble();
    
    System.out.println("Enter the side3: ");
    double side3 = scn.nextDouble();
    
    double perimeter = side1 + side2 + side3;
    double target = 5000;
    
    double rounds = target / perimeter;
    System.out.println("The total number of rounds the athlete will run is"+rounds +"to complete 5 km");
    }
}