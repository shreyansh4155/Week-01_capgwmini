import java.lang.*;
import java.util.*;

class SumOfNaturalNumbers {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number till you want to find the Sum: ");
		
		int number = scn.nextInt();

		int sum = number * (number + 1)/2;
		

	       	System.out.println("The sum of "+number+" is " +sum +);
	}
}